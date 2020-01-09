/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;

/**
 *
 * @author karen
 */
public class conexionDB {

    private final Connection connection;
    private Statement sen;

    public conexionDB() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        // Database connect
        // Conectamos con la base de datos
        connection = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/shoppingCart",
                "postgres", "02587");

    }
    
     protected ResultSet ejecutar(String query) throws SQLException {
        System.out.println(query);
        sen = connection.createStatement();

        if (
            query.toLowerCase().startsWith("insert") || 
            query.toLowerCase().startsWith("update") ||
            query.toLowerCase().startsWith("delete")
        ) {
            sen.executeUpdate(query);
            close();
            return null;
        }
            
        return sen.executeQuery(query);
    }

    protected void close() throws SQLException {
        sen.close();
    }

}
