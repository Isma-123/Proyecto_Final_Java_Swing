/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.interfaces;

import Clases.Usuarios;
import java.util.List;

public interface DaouUsers {
   public void Registrar(Usuarios usuarios) throws Exception;
    public void Modificar(Usuarios usuarios) throws Exception;
     public void Eliminar(int UserId) throws Exception;
     public List<Usuarios> listar(String name) throws Exception;
      public Usuarios getUserById(int userId) throws Exception;

    
    
}
