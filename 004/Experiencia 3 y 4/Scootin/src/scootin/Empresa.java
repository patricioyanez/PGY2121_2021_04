
package scootin;

import java.util.ArrayList;


public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        // crea la coleccion que almacenará a los empleados.
        empleados = new ArrayList<Empleado>();
    }
    
    // EJERCICIO: crear metodos para: agregar, listar y buscar(1) empleados
    public Boolean agregar(Empleado empleado)
    {
        return empleados.add(empleado);
    }
    
    public void listar()
    {
        // rutina para mostrar los empleados en la consola ...
        for(Empleado empleado: empleados)
        {
            System.out.println(empleado);
        }
    }
    
    // crear el metodo buscar v/F
}
