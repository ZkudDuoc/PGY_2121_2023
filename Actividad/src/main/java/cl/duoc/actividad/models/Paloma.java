package cl.duoc.actividad.models;

public class Paloma extends Mascota {
    
    private String volar() {
        return "Estoy volando";
    }
    
    @Override
    public String toString(){
        return super.toString() + " "+ volar();
    }
}
