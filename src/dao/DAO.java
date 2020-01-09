/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author karen
 */
public interface DAO<T> {
    void create(T ob) throws SQLException;
    List<T> read() throws SQLException;
    void update(T ob) throws SQLException;
    void delete(long id) throws SQLException;
}
