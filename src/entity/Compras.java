/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author karen
 */
public class Compras {
    private long ID_factura;
    private long ID_producto;
    private  String fecha;

    public Compras() {
    }

    public long getID_factura() {
        return ID_factura;
    }

    public void setID_factura(long ID_factura) {
        this.ID_factura = ID_factura;
    }

    public long getID_producto() {
        return ID_producto;
    }

    public void setID_producto(long ID_producto) {
        this.ID_producto = ID_producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
