package sentencias004;
import java.util.Scanner; // la clase que permite leer el teclado

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
        int i=0;
        for(; i < 1000;)
        {
            System.out.println("EL valor es: " + i++);
        }
        //System.out.println("valor: " + i);
        
        
        
        // Menú
        // agregar al inicio: import java.util.Scanner;
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        // pregunta si opcion es distinto. se usa ! y equals
        while(!opcion.equals("5"))
        {
            System.out.println("***** Menú *****");
            System.out.println("1.- Ingreso");
            System.out.println("2.- Modificación");
            System.out.println("3.- Eliminar");
            System.out.println("4.- Listar");
            System.out.println("5.- Salir");
            System.out.print("Ingrese su opción: ");
            opcion = leer.next();
        }
        
        //Ejercicio fiesta:
        
        int adultos = 0;
        int ninos   = 0;
        int asistentes = 0;
        int edad    = 0;
        
        
        // importar Scanner...
        System.out.print("Ingrese la cantidad de asistentes: ");
        asistentes = leer.nextInt();
        
        for(int ind = 1; ind <= asistentes; ind++)
        {
            System.out.print("Ingrese la edad ");
            edad = leer.nextInt();
            
            if(edad <= 12)
            {
                ninos++;
            }
            else
            {
                adultos++; //adultos = adultos + 1;
            }
        }
        
        System.out.println("Total de adultos: " + adultos);
        System.out.println("Total de niños  : " + ninos);
        
        
    }
    
}
