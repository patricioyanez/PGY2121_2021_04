package clasestring;

public class ClaseString {
    
    public static void main(String[] args) {
        // creacion de un string
        String texto;
        texto = "hola";
        String texto2 = "Buenos dias!";
        
        String texto3 = new String("12");
        int numero = 12;
        System.out.println(texto3 + numero);
        texto = "aeiou";
        System.out.println(texto);
        
        StringBuilder sb = new StringBuilder( "fasdfasd");
        sb.append("afsdfasdf");
        
        
        // metodos de la clase String
        System.out.println("hola".length());
        System.out.println("Cantidad de carecteres: " + texto.length());
        // equals
        System.out.println("*********** Equal");
        System.out.println("Case sensitive");
        System.out.println("a".equals("a")); // true
        System.out.println("a".equals("A")); // false???
        System.out.println("A".equalsIgnoreCase("a"));
        System.out.println("*********** CASE");
        System.out.println("Vuelve a mayusculas el texto: " + texto.toUpperCase());
        System.out.println("Vuelve a menuscula el texto: " + "HOLA".toLowerCase());
        System.out.print("StartsWith:");
        System.out.println("estrella".startsWith("est"));
        System.out.println("EndsWith:"+"estrella".endsWith("lar"));
        System.out.println("12.100.560-k".replace(".", "").replace("-", "").toUpperCase());
        
        String rut = " 12312321k ";
        System.out.println("_"+rut+"_");
        System.out.println("_"+rut.trim()+"_");
        
        String restante = rut.substring(1);
        System.out.println("_"+restante+"_");
        System.out.println(rut.trim().substring(0, 4));
        //   
        // ejercicio: que devuelva los ultimos 4 caracteres
        System.out.println("daniel giovani acuna".replace("acuna", "acuña"));
        
        
        
    }
    
}
