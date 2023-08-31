/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc_pgy2131.proyect;

import java.util.Scanner;

/**
 *
 * @author vicen
 */
public class Proyect {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Tarjeta tarjeta2 = new Tarjeta(1111, 111, 50000, true);
        Tarjeta tarjeta1 = new Tarjeta(2222, 222, 1000, false);
        Cliente cliente2 = new Cliente("Juanito", "Montes",18,tarjeta2);
        cliente1.setNombre("Pedro");
        cliente1.setApellido("Montes");
        cliente1.setEdad(25);
        cliente1.setTarjeta(tarjeta1);
        cliente1.mostrarDatos();
        cliente2.mostrarDatos();
        
        int opcion =0;
        int saldoOpcion=0;
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        
        do{
            System.out.println("MENU");
            System.out.println("1.-Agregar saldo");
            System.out.println("2.-Retirar saldo");
            System.out.println("3.-Consultar datos");
            System.out.println("4.-Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Cuanto saldo desea agregar");
                    saldoOpcion = leer1.nextInt();
                    System.out.println(cliente1.getTarjeta().agregarSaldo(saldoOpcion));
                    break;
                case 2:
                    System.out.println("Cuanto saldo desea retirar?");
                    saldoOpcion= leer1.nextInt();
                    System.out.println(cliente1.getTarjeta().retirarSaldo(saldoOpcion));
                    
                    break;
                case 3:
                    cliente1.mostrarDatos();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
            
                default: 
                    System.out.println("Error, escoja un numero valido");
        
        } 
        }while(opcion!=4);
        }
        
        
    }

