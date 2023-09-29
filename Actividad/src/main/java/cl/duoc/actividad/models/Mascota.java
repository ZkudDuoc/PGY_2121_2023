package cl.duoc.actividad.models;

public class Mascota {
    private int id;
    private String raza;
    private String color;
    private String nombre;

    public Mascota(int id, String raza, String color, String nombre) {
        this.id = id;
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }
    public Mascota() {
        this.id = 0;
        this.raza = "";
        this.color = "";
        this.nombre = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return this.id + ": " + this.raza + " " + this.color + " " + this.nombre;
    }
}    
