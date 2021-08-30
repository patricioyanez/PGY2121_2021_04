public class Pizza {
// atributos
    private String nombre;
    private String tamano;
    private String masa;

    // constructor
    public Pizza()
    {
        //System.out.println("Constructor ejecutado ***************");
        this.nombre = "";
        this.tamano = "";
        this.masa = "";
    }
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }
    // getter & setter
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    // métodos customer
    public void preparar()
    {
        System.out.println("Se está preparando su Pizza");
    }

    public void calentar()
    {
        System.out.println("Se está horneando la Pizza");
    }

    public String imprimir()
    {
        String dato = this.nombre + "\n" +
                        this.masa + "\n" +
                        this.tamano;
        System.out.println(dato);
        return dato;
    }
}
