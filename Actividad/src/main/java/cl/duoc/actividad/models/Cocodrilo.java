package cl.duoc.actividad.models;

public class Cocodrilo extends Mascota{
    private String tipoAgua;
    private int nroDientes;

    public Cocodrilo(String tipoAgua, int nroDientes, int id, String raza, String color, String nombre) {
        super(id, raza, color, nombre);
        this.tipoAgua = tipoAgua;
        this.nroDientes = nroDientes;
    }

    public Cocodrilo() {
        super();
        this.tipoAgua = "";
        this.nroDientes = 0;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public int getNroDientes() {
        return nroDientes;
    }

    public void setNroDientes(int nroDientes) {
        this.nroDientes = nroDientes;
    }
    
    @Override
    public String toString() {
        return super.toString() + ":  " + this.tipoAgua + " " + this.nroDientes; 
    }
}
