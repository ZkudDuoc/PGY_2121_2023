package cl.duoc.actividad;

import cl.duoc.actividad.models.Cocodrilo;
import cl.duoc.actividad.models.Dinosaurio;
import cl.duoc.actividad.models.Paloma;

public class Actividad {

    public static void main(String[] args) {
        Dinosaurio dino = new Dinosaurio();
        Cocodrilo coco = new Cocodrilo();
        Paloma palo =  new Paloma();
        
        dino.setId(12);
        dino.setRaza("rex");
        dino.setColor("azul");
        dino.setNombre("carnalito");
        dino.setNroPatas(4);
        dino.setEscamas(true);
        
        coco.setId(123);
        coco.setRaza("coco");
        coco.setColor("rojo");
        coco.setNombre("azulito");
        coco.setTipoAgua("dulce");
        coco.setNroDientes(10);
        
        palo.setId(123);
        palo.setRaza("cucu");
        palo.setColor("negra");
        palo.setNombre("palomita");
        
        System.out.println(dino);
        System.out.println(coco);
        System.out.println(palo);
    }
}
