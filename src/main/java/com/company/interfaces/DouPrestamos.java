/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.interfaces;


import Clases.Prestamos;
import java.util.List;

public interface DouPrestamos {
      public void RegistrarFacturas(Prestamos Fecha_pago, Prestamos pago) throws Exception;
       public void Eliminar(Prestamos usuarios) throws Exception;
        //public void Modificar(Prestamos usuarios) throws Exception;
         public List<Prestamos> listar()  throws Exception;
}
