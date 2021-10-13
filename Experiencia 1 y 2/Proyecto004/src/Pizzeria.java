public class Pizzeria {

    // método donde se inicia la ejecución de la aplicación
    public static void main(String[] args)
    {
        System.out.println("Hola Mundo");
        System.out.println("¿Cómo están? :)");
        
        // creo el objeto // instancia
        Pizza pizza1 = new Pizza();
        
        // invocar metodos
        pizza1.preparar();
        pizza1.calentar();
        pizza1.setNombre("Napolitana");
        pizza1.setTamano("Familiar");
        pizza1.setMasa("Delgada");
        
        pizza1.imprimir();
        System.out.println("******************");
        System.out.println(pizza1.getTamano());
        
        String tamano = pizza1.getTamano();
        System.out.println(tamano);
        
        
        Pizza pizza2 = new Pizza("Peperoni", "Individual", "Gruesa");
    //    pizza2.imprimir();
        pizza2.setNombre("Super Peperoni, la pulenta :) ");
        pizza2.imprimir();
        
        // git hub
    }
}
