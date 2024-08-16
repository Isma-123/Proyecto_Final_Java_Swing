/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author isma2
 */
public class Usuarios {
    private int id_usuario;
    private int edad;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    private String apellido;
    private String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }




            
}
