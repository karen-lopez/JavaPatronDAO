/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.conexionDB;
import entity.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class DAO_producto extends conexionDB implements DAO<Producto>{

    public DAO_producto() throws SQLException, ClassNotFoundException {
        super();
    }

    
    
    @Override
    public void create(Producto ob) throws SQLException {
        ejecutar("INSERT INTO shopping.producto VALUES('"+ob.getID_producto()
                +"','"+ob.getNombre()
                +"','"+ob.getDescripcion()
                +"')");
    }

    @Override
    public List<Producto> read() throws SQLException{
        List<Producto> lista = new ArrayList<>();
        
        ResultSet resultado = ejecutar("SELECT * FROM shopping.\"producto\" ORDER BY nombre ASC;");
        
        Producto productoTemporal;
        
        while(resultado.next()){
            productoTemporal = new Producto();
            productoTemporal.setID_producto(resultado.getLong(1));
            productoTemporal.setNombre(resultado.getString(2));
            productoTemporal.setDescripcion(resultado.getString(3));
            
            lista.add(productoTemporal);
        }
        
        return lista;
    }

    @Override
    public void update(Producto ob) throws SQLException{
        ejecutar("UPDATE shopping.producto SET nombre = '"+ob.getNombre()
                +"', descripcion = '"+ob.getDescripcion()+"';");
    }

    @Override
    public void delete(long id) throws SQLException{
        ejecutar("DELETE FROM shopping.producto WHERE ID_producto = '"+id+"'");
    }
    
}
