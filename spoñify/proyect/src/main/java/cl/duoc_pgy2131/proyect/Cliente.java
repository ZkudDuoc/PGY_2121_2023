/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc_pgy2131.proyect;

/**
 *
 * @author vicen
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private Tarjeta tarjeta;

//Metodos
//Constructores
//Con    Sin

public Cliente(){} 


public Cliente(String nombre, String apellido, int edad, Tarjeta tarjeta){
    this.nombre = nombre;
    this.apellido= apellido;
    this.edad= edad;
    this.tarjeta = tarjeta;
}
//Accesadores - getter
public String getNombre(){
    return this.nombre;
}
public String getApellido(){
    return this.apellido;
}
public int getEdad(){
    return this.edad;
}
public Tarjeta getTarjeta(){
    return this.tarjeta;
}
//Mutadores - setter modificacion de datos
public void setNombre(String nombre){
    if (nombre.length()>=2){
        this.nombre =nombre;
    }else{
        System.out.println("ERROR, nombre muy corto");
    
    }
}   
public void setApellido(String apellido){
    this.apellido = apellido;
}
public void setEdad(int edad){
    this.edad = edad;
}
public void setTarjeta(Tarjeta tarjeta){
    this.tarjeta = tarjeta;
}
//Personalizados

public void mostrarDatos(){
    System.out.println("Nombre: "+getNombre());
    System.out.println("Aèllido: "+getApellido());
    System.out.println("Edad: "+getEdad());
    System.out.println(tarjeta.toString());
}



}
