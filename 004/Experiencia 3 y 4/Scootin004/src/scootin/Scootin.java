/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scootin;

/**
 *
 * @author patri
 * REEMPLAZA EL TESTEMPRESA
 */
public class Scootin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puesto puesto1 = new Puesto(100, "Vendedor");
        Puesto puesto2 = new Puesto(200, "Supervisor");
        
        Empleado empleado1 = new Empleado("1-9", "Juan Díaz", "Masculino", 1, 30, puesto1);
        Empleado empleado2 = new Empleado("2-7", "Pedro Aros", "Masculino", 5, 45, puesto2);
        
        // crea la coleccion de empleados
        Empresa scootin = new Empresa(); 
        
        // agrega a los empleados
        scootin.agregar(empleado1);
        scootin.agregar(empleado2);
        
        // informa que el rut ya existe
        scootin.agregar(empleado2);
        
        // muesta listado de todos los empleados
        scootin.listar();
        
        //TAREA: confirmar si un rut existe y luego eliminarlo
        
    }
    
}
