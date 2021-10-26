/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listareproduccion;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class ListaReproduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDeCanciones lista1 = new ListaDeCanciones();
        ListaDeCanciones lista2 = new ListaDeCanciones();
        
        Artista artista1 = new Artista("Los Bunker", "Chile");
        Artista artista2 = new Artista("Los Tres", "Chile");
        
        Cancion cancion1 = new Cancion("miño", artista1, 230, true, true);
        Cancion cancion2 = new Cancion("He barrido el sol", artista2, 300, true, false);
        Cancion cancion3 = new Cancion("Torre de babel", artista2, 450, false, false);
        Cancion cancion4 = new Cancion("Bailando solo", artista1, 400, false, true);
        Cancion cancion5 = new Cancion("un amor violento", artista2, 350, true, true);
        Cancion cancion6 = new Cancion("Mientele", artista1, 350, true, false);
        
        lista1.agregar(cancion1);
        lista1.agregar(cancion2);
        lista1.agregar(cancion3);
        lista2.agregar(cancion4);
        lista2.agregar(cancion5);
        lista2.agregar(cancion6);
        
        
        
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        while(!opcion.equals("0"))
        {
            System.out.println("****  Super Menú ****");
            System.out.println("1.- Lista 1");
            System.out.println("2.- Lista 2");
            System.out.println("0.- Salir");
            System.out.print("Escriba una opción válida:");
            opcion = leer.next();
            
            if(opcion.equals("1"))
            {
                lista1.listar();
            }
            else if(opcion.equals("2"))
            {
                lista2.listar();
            }
        }
        
        
    }
    
}
