/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.proyectoherencia.models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Cliente extends Persona{
   private String rut; 

    public Cliente(String rut, int id, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(id, nombre, apellido, fechaNacimiento);
        this.rut = rut;
    }

    public Cliente() {
        super();
        this.rut = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    @Override 
    public String toString(){
        return super.toString() + ": " + this.rut;
    }
}
