/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaboracion;

import java.util.Date;

/**
 *
 * @author patri
 */
public class Colaboracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona(200, "Juan", "Maipú");
        
        // asignar valores mediante los setter a la persona 1
        p1.setRut(100);
        p1.setNombre("Ana");
        p1.setComuna("Curacaví");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        
        Entrada e1 = new Entrada(1, 100, new Date(),15000, p1);
        Entrada e2 = new Entrada(2, 101, new Date(),15000, p2);
        Entrada e3 = new Entrada(3, 102, new Date(),15000, null);
        
        // 
        Persona p3 = new Persona(300,"Diego", "Quilicura");
        e3.setPersona(p3);
        
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
        // se necesita saber la comuna del dueño de la entrada 2
        System.out.println("\n La comuna es:\n" + e2.getPersona().getComuna());
        
        
        // que rut tiene la persona que compro la entrada 3
        System.out.println("\n el rut es: \n"+ e3.getPersona().getRut());
        
        System.out.println("\n el rut es: \n"+ e1.getPersona().toString());
        
        
        
        
    }
    
}
