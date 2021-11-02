/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author patri
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        
        // si se aplico la herencia (se ve el metodo comer)
        animal.comer();
        mamifero.comer();
        
        // sobrecarga de metodos (tener mas de 1 metodo con
        // el mismo nombre pero distinto parametro
        
        Mamifero humano = new Mamifero();
        humano.beber();
        humano.beber("Cermeza");
        humano.beber("leche", 1);
        
        //instancia de una clase abstracta (no se puede)
        // Cuidados cuidados = new Cuidados();
        
        // clase FINAL si se puede instanciar pero no heredar
        // La clase String es una clase final por lo quue no se puede heredar
        String palabra = "hola";
        
        
        //USO DE la constante de la interface
        
        int total = (int)(10000 * IOperaciones.IVA);
        System.out.println("El total es: " + total);
        
    }
    
}
