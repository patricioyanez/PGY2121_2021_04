package clasestring;

public class ClaseString {
    
    public static void main(String[] args) {
        // creacion de un string
        String texto;
        texto = "hola";
        String texto2 = "Buenos dias!";
        
        String texto3 = new String("afdsfasd");
        
        texto = "aeiou";
        System.out.println(texto);
        
        StringBuilder sb = new StringBuilder( "fasdfasd");
        sb.append("afsdfasdf");
        
        System.out.println("Cantidad de carecteres: " + texto.length());
        System.out.println("aaa".equals("aaa"));
        System.out.println("aaa".equals("AAA"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));
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
        
        // ejercicio: que devuelva los ultimos 4 caracteres
        
        
        
    }
    
}
