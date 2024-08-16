/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author isma2
 */
public class Prestamos {
    
  
    private String fecha_pago;

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    private int id_factura;
    private int id_pelicula;
    private String usuario;

    public String getFecha_pago() {
        return fecha_pago;
    }

    public int getId_factura() {
        return id_factura;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public String getUsuario() {
        return usuario;
    }

    
}
