/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc_pgy2131.spotifychino;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vicen
 */
public class SpotifyChino {

    public static void main(String[] args) {
        List<Cancion> canciones = new ArrayList<>();
        List<Artista> artistas = new ArrayList<>();
        canciones.add(new Cancion("Taxista","Pop",3,45,321412,true));
        Cancion cancionRicardo = null;
        artistas.add(new Artista("Ricardo Arjona",123,cancionRicardo,90000));
        canciones.add(new Cancion("Animals","Electronica",2,3,98988543,false));
        Cancion cancionGarrix = null;
        artistas.add(new Artista("Martin Garrix",222,cancionGarrix,2321));
        canciones.add(new Cancion("Daylight","Pop",3,42,3124124,true));
        Cancion cancionHarry = null;
        artistas.add(new Artista("Harry Styles",21,cancionHarry,999999));
        
        
        int opcion= 0;
        Scanner leer = new Scanner(System.in);
        
        
        do{
            System.out.println("Welcome to Spoñify");
            System.out.println("1) Favoritos");
            System.out.println("2) Artistas");
            System.out.println("3) Canciones");
            System.out.println("4) Cerrar SPOÑIFY");
            opcion = leer.nextInt();
            switch(opcion){
                case 1 -> {
                    System.out.println("FAVORITOS");
                        for(Cancion cancion : canciones){
                            if(cancion.isFavoritos()){
                                System.out.println("Nombre: " + cancion.getNombre());
                                System.out.println("Genero: " + cancion.getGenero());
                                System.out.println("Duracion: " + cancion.getMinutos() + ":" + cancion);
                        }
                    }
                }
                
                case 2 -> {
                
                }
                case 3 -> {
                
                }
                
                case 4 -> {
                
                }
        }
        }while(opcion!=4);
    }
}
