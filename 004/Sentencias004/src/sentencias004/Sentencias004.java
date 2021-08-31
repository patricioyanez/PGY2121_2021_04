
package sentencias004;


public class Sentencias004 {

    public static void main(String[] args) {
    
        int nota = 30;
        
        if(nota == 40)
            System.out.println("Ud tiene un " + nota);
        
        if(nota >= 40)
        {
            System.out.println("Ud aprobó la asignatura");
            System.out.println("Felicitaciones");
        }
        
        if(nota >= 40)
        {
            System.out.println("UD Aprobó");
        }
        else
        {
            System.out.println("Ud. Reprobó");            
        }
        
        
        if(nota < 30)
            System.out.println("Rendimiento malo");
        else if(nota > 30 && nota < 60)
            System.out.println("Redimiento se puede mejorar");
        else if(nota < 60)
            System.out.println("Buen rendimiento");
        else
            System.out.println("Rendimiento excelente");
     
        if(nota == 30 || nota == 31)
        {
            System.out.println("tienes un 3x");
        }
        
        String curso = "";
        int numero = 6;
        switch(numero){
            case 1:
                curso ="Primero";
                break;
            case 2:
                curso ="Segundo";
                break;
            case 3:
                curso ="Tercero";
                break;
            case 4:
                curso ="Cuarto";
                break;
            case 5:
                curso ="Quinto";
                break;
            case 6:
                curso ="Sexto";
                break;
        }
        System.out.println("El curso es: " + curso);
        
        
        // ciclos:
        int numero1 = 1;
        while(numero1 <= 10)
        {
            System.out.println("" + numero1++);
        }
        while(numero1 >= 0)
        {
            System.out.println("" + numero1--);
        }
        
    }
    
}
