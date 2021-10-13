
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
        // evita que rut se repirta
        if(this.buscar(empleado.getRut()))
        {
            System.out.println("El rut " + empleado.getRut() + " ya existe");
            return false;        
        }
        return empleados.add(empleado);
    /*    
        else
        {
            return empleados.add(empleado);
        }
    */
    }
    
    public void listar()
    {
        // rutina para mostrar los empleados en la consola ...
        for(Empleado empleado: empleados)
        {
            System.out.println(empleado);
            //System.out.println("rut: " + empleado.getRut() + " Nombre: " + empleado.getNombreCompleto());
            
        }
    }
    
    // crear el metodo buscar v/F    
    public Boolean buscar(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(rut.equalsIgnoreCase(empleado.getRut()))
                return true;
        }
        return false;
    }
    // Ejercicio: Eliminar empleado.
    public Boolean eliminar(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(rut.equalsIgnoreCase(empleado.getRut()))
                return empleados.remove(empleado);
        }
        return false;
    }
}
