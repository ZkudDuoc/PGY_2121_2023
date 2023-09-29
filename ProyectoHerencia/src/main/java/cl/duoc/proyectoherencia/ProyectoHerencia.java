package cl.duoc.proyectoherencia;

import cl.duoc.proyectoherencia.models.Cliente;
import cl.duoc.proyectoherencia.models.Usuario;

public class ProyectoHerencia {

    public static void main(String[] args) {
        Usuario user = new Usuario();
        user.setId(10);
        user.setNombre("sebastian");
        user.setApellido("Contreras");
        user.setEmail("niko10@gmail");
        user.setPassword("1234");
        
        Cliente cli = new Cliente();
        cli.setId(12);
        cli.setNombre("tata");
        cli.setApellido("pinocho");
        cli.setRut("1234214142");
        
        System.out.println(user);
        System.out.println(cli);
    }
}
