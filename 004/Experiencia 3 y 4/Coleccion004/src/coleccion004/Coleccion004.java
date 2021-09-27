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
               
       for(String aux: apellidos)
       {
           System.out.println("EL apellido: " + aux.toUpperCase());
       }
       
        
    }
    
}
