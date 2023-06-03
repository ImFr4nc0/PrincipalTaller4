/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

public class Persona{
    String nombre, apellidos, telefono, direccion, p;
    Persona(String nombre, String apellidos, String telefono, String direccion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;   
    }
    
    String Persona(){
        return p = nombre + "-" + apellidos + "-" + telefono + "-" + direccion;
    }
}
