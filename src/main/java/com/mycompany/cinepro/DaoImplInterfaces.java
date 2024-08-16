/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinepro;

import Clases.Prestamos;
import com.company.bd.BD;
import com.company.interfaces.DouPrestamos;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author isma2
 */
public class DaoImplInterfaces extends BD implements DouPrestamos {

 

    public void Eliminar(Prestamos usuarios) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Prestamos> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void RegistrarFacturas(Prestamos pago, Prestamos fecha_pago) throws Exception {
                
        
    }
       
}
