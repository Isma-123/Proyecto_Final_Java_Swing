/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isma2
 */
public class BD {
    protected Connection con;
    private final String JDBC_Drive = "com.mysql.cj.jdbc.Driver";
    private final String db_Url = "jdbc:mysql://localhost:3306/JavaAplication"; // nombre de la base de datos
    
    private final String USER = "root";
    private final String pass = "Abdias2365";
    
      public void Conectar() throws ClassNotFoundException { 
       
        try {
            con = DriverManager.getConnection(db_Url, USER, pass);
             Class.forName(JDBC_Drive);
              System.out.println("conectado correctamente a la base de datos ");
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" NO se puedo conectar a la base de datos ");
        }
        
          }
      
         public void Cerrar() { 
             if(con != null) { 
                 try {
                     if(!con.isClosed()) {
                         con.close();  // para cerrar la conexion
                     }
                 } catch (SQLException ex) {
                     Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
         }
           
      }
    
    

