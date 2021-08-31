/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectostreaming;

/**
 *
 * @author patri
 */
public class ProyectoStreaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
// objetos...
        System.out.println("Streaming");
        Cancion cancion1 = new Cancion();
        
        // asignar valor al nombre de la cancion?
        cancion1.setTitulo("Asereje");
        cancion1.setArtista("Las Ketchup");
        cancion1.setEsFavorita(false);
        cancion1.setFueDescargada(true);
        cancion1.setSegundos(209);
        
        
        // se invoca o se llama al metodo imprimir
        String res = cancion1.imprimir();
        System.out.println(res);
        
        String artista = cancion1.getArtista();
        
        System.out.println("El artista es: " + artista);
        System.out.println("\n");
        System.out.println(cancion1.cancionExtendida()); 
        
        
        Cancion cancion2 = new Cancion("El guatón Loyola", 
                                        "Tio Rosselot", 
                                        180, 
                                        true, 
                                        true);
        System.out.println("El artista 2 es: " + cancion2.getArtista());
        
        System.out.println(cancion2.imprimir());
         
        
        
        
        
        
    }
    
}