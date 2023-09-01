package cl.duoc.scannertest;

import cl.duoc.scannertest.Models.Persona;

public class Scannertest {

    public static void main(String[] params) {
        Persona juan = new Persona();
        juan.setNombre("Juan");
        juan.setApellido("Juan");
        juan.setNacimientoFecha(05,05,1992);
        
        
        System.out.println("Juan: " + juan.getId());
        
        Persona francisco = new Persona();
        
        System.out.println("Francisco" + francisco.getId());
        
    }
}
