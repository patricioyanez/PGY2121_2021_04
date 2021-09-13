/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaboracion;

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
        
        
            
        
        
        
    }
    
}
