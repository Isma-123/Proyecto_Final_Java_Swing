/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinepro;

import Clases.Usuarios;
import com.company.bd.BD;
import com.company.interfaces.DaouUsers;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

  public class DaoUsersImpl extends BD implements DaouUsers {

    public void Registrar(Usuarios usuarios) throws Exception {
         try { 
             this.Conectar();
             // para trabajar con la base de datos
             PreparedStatement st = this.con.prepareStatement("INSERT INTO usuarios(nombre, Apellido, Edad, email) VALUES( ?, ?, ?, ?)");
             st.setString(1, usuarios.getNombre());
             st.setString(2, usuarios.getApellido());
             st.setInt(3, usuarios.getEdad());
             st.setString(4, usuarios.getEmail());
             st.executeUpdate();
             st.close();
             
         } catch (Exception e) { 
               throw e;
         } finally { 
              this.Cerrar();
         }
    }

    public void Modificar(Usuarios usuarios) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void Eliminar(int userId) throws Exception {
                    
           try { 
             this.Conectar();
             // para trabajar con la base de datos
             PreparedStatement st = this.con.prepareStatement("DELETE FROM usuarios WHERE id_usuario = ?; ");
             st.setInt(1, userId);
             st.executeUpdate();
             st.close();
             
         } catch (Exception e) { 
               throw e;
         } finally { 
              this.Cerrar();
         }
          
    }

    public List<Usuarios> listar(String name) throws Exception {
         // listar usuarios 
          List<Usuarios> lista = new ArrayList<>();
    
    try { 
        this.Conectar();
        
        // Selecciona la consulta adecuada según el valor de 'name'
        String query = name.isEmpty() ? "SELECT * FROM usuarios" : "SELECT * FROM usuarios WHERE nombre LIKE ?";
        
        // Prepara la consulta
        PreparedStatement st = this.con.prepareStatement(query);
        
        // Si 'name' no está vacío, establece el valor para el parámetro
        if (!name.isEmpty()) {
            st.setString(1, "%" + name + "%");
        }
        
        // Ejecuta la consulta
        ResultSet rs = st.executeQuery();
        
        // Procesa los resultados
        while (rs.next()) { 
            Usuarios user = new Usuarios();
            user.setId_usuario(rs.getInt("id_usuario"));
            user.setNombre(rs.getString("nombre"));
            user.setApellido(rs.getString("apellido"));
            user.setEdad(rs.getInt("edad"));
            user.setEmail(rs.getString("email"));
            
            // Agrega el usuario a la lista
            lista.add(user);
        }
        
        // Cierra recursos
        st.close();
        rs.close();
        
    } catch (Exception e) { 
        throw e;
    } finally { 
        this.Cerrar();
    }
    
    return lista;
}
        
     

    public Usuarios getUserById(int iduser) throws Exception {
       
         Usuarios user = new Usuarios();
         
          try { 
              
              this.Conectar();
               PreparedStatement st = this.con.prepareStatement("SELECT*FROM usuarios WHERE id_usuario = ?;");
               st.setInt(1, iduser);
             
                ResultSet rs = st.executeQuery();
                
                 while(rs.next()) { 
                 
                     user.setId_usuario(rs.getInt("id_usuario"));
                     user.setNombre(rs.getString("nombre"));
                     user.setApellido(rs.getString("Apellido"));
                     user.setEdad(rs.getInt("edad"));
                     user.setEmail(rs.getString("email"));
                     
                      // agregamos el usuario a la lista
                      
                     
                 }
                 st.close();
                 rs.close();
          } catch (Exception e) { 
               throw e;
         } finally { 
              this.Cerrar();
         }
          
          return user;
    }
    
   }
