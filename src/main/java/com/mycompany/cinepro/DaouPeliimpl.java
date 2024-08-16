/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinepro;

import Clases.Peliculas;
import com.company.bd.BD;
import com.company.interfaces.DaoMovie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author isma2
 */
public class DaouPeliimpl extends BD implements DaoMovie {

    public List<Peliculas> listar(String name) throws Exception {
           List<Peliculas> lista = new ArrayList<>();
    
    try { 
        this.Conectar();
        
        // Selecciona la consulta adecuada según el valor de 'name'
        String query = name.isEmpty() ? "SELECT * FROM peliculas" : "SELECT * FROM peliculas WHERE titulo LIKE ?";
        
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
           Peliculas peli = new Peliculas();
           peli.setId_pelicula(rs.getInt("id_pelicula"));
           peli.setTitulo(rs.getString("titulo"));
           peli.setTipo(rs.getString("tipo"));
           peli.setDuracion(rs.getString("duracion"));
            
            // Agrega el usuario a la lista
            lista.add(peli);
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

    public void Agregar(Peliculas peliculas) throws Exception {
         try { 
             this.Conectar();
             // para trabajar con la base de datos
             PreparedStatement st = this.con.prepareStatement("INSERT INTO peliculas(titulo, tipo, duracion) VALUES( ?, ?, ?)");
             st.setString(1, peliculas.getTitulo());
             st.setString(2, peliculas.getTipo());
             st.setString(3, peliculas.getDuracion());
             st.executeUpdate();
             st.close();
             
         } catch (Exception e) { 
               throw e;
         } finally { 
              this.Cerrar();
         } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void eliminar(int idPeli) throws Exception {
         
     try { 
         this.Conectar();
         String sql = " DELETE FROM peliculas WHERE id_pelicula = ?;";
         PreparedStatement st = this.con.prepareStatement(sql);
         st.setInt(1, idPeli);
         st.executeUpdate();
         st.close();
         
     } catch (Exception e) { 
           throw e;
     } finally { 
         this.Cerrar();
     }
    }

    public void getPelibyId(int idPeli) throws Exception {
         Peliculas peli = new Peliculas();
          
         
         try { 
             this.Conectar();
            String sql = " SELECT * FROM peliculas WHERE id_pelicula = ?";
            PreparedStatement st = this.con.prepareStatement(sql);
             st.setInt(1, idPeli);
             st.executeUpdate();
             st.close();
             ResultSet rs = st.executeQuery();
             while(rs.next()) { 
                peli.setId_pelicula(rs.getInt("id_pelicula"));
                peli.setTitulo(rs.getString("Titulo"));
                peli.setTipo(rs.getString("Tipo"));
                peli.setDuracion(rs.getString("duracion"));
             } 
           
             st.close();
             rs.close(); 
            
         } catch (Exception e) { 
             throw e;
         } finally { 
             this.Cerrar();
         }
    }

  

 

    
}
