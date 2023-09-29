package cl.duoc.proyectoherencia.models;

import java.time.LocalDate;

public class Usuario extends Persona {
    private String email;
    private String Password;

    public Usuario(String email, String Password, int id, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(id, nombre, apellido, fechaNacimiento);
        this.email = email;
        this.Password = Password;
    }

    public Usuario() {
        super();
        this.email = "";
        this.Password = ""; 
    }
    
    /*public Usuario(String email, String password) {
        super();
        this.email = email;
        this.Password = password;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString(){
        return super.toString() + ": "+ this.email + " " + this.Password;
    }
}
