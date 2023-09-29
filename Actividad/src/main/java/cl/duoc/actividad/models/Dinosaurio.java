package cl.duoc.actividad.models;

public class Dinosaurio extends Mascota {
    private int nroPatas;
    private boolean escamas;

    public Dinosaurio(int nroPatas, boolean escamas, int id, String raza, String color, String nombre) {
        super(id, raza, color, nombre);
        this.nroPatas = nroPatas;
        this.escamas = escamas;
    }

    public Dinosaurio() {
        super();
        this.nroPatas = 0;
        this.escamas = false;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }
    
    @Override
    public String toString() {
        return super.toString() + ": " + this.nroPatas + " " + this.escamas;
    }
}
