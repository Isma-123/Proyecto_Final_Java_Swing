/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.interfaces;

import Clases.Peliculas;
import java.util.List;


public interface DaoMovie {
       public  List<Peliculas> listar(String name) throws Exception;
       public void Agregar(Peliculas peliculas) throws Exception;
       public void eliminar(int idPeli) throws Exception;
       public void getPelibyId(int idPeli) throws Exception;
   
}
