package coleccion004;

import java.util.ArrayList;

public class Coleccion004 {


    public static void main(String[] args) {
        // Crear un ArrayList (plural)
        // se debe importar la clase ArrayList
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        ArrayList<String> apellidos = new ArrayList<String>();
        
        //para nombres a la colección.
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Ignacia");
        nombres.add("Diego");
                
        for(String aux : nombres)
        {
            System.out.println(aux);
        }
        
       // ejercicio: almacenar 5 apellidos en la correspondiente.
       // e imprimir por consola :), todos tienen que estar en mayuscula.
       
       
       apellidos.add("Perez");
       apellidos.add("Diaz");
       apellidos.add("Fernandez");
       apellidos.add("Ahumada");
       apellidos.add("Briones");
               
       for(String apellido: apellidos)
       {
           System.out.println("EL apellido: " + apellido.toUpperCase());
       }
       
       // métodos disponibles
        System.out.println("\n\n************** metodos de ArrayList ******************");
          //devuelva la cant de elementos
        System.out.println("Cantidad de elementos:" + apellidos.size());      
        apellidos.clear(); // se limpiar la colección       
        System.out.println("Cantidad de elementos:" + apellidos.size());
        
        // busca el elemento señalado en la colección
        boolean estaElNombre = false;
        estaElNombre = nombres.contains("Ignacia");
        System.out.println("Existe el nombre: " + (estaElNombre?"si":"no"));
        
        if(estaElNombre)
            System.out.println("Sí está");
        else
            System.out.println("No está");
        
        System.out.println("Existe el nombre: " + estaElNombre);
        
        System.out.println("Cantidad de nombres: " + nombres.size());
        // rescato el objeto según el nro de indice señalado
        System.out.println("El nombre del indice 1 es: " + nombres.get(1));
        System.out.println("El nombre del indice 2 es: " + nombres.get(2));
        
        // devuelve el indice de la coincidencia del elemento señalado
        System.out.println("El indice es: " + nombres.indexOf("Ana"));
        System.out.println("El indice es: " + nombres.indexOf("Prosperina"));
        // elimina un elemento según el criterio utilizado (por obj o por indice)
        System.out.println("remove objeto: " + nombres.remove("Ana"));
        System.out.println("remove indice: " + nombres.remove(0));
        System.out.println("Cantidad actual: "+ nombres.size());
        
        
        
        
        
    }
    
}
