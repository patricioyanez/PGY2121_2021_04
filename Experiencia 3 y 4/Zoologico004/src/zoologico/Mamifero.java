
package zoologico;


public class Mamifero extends Animal {
    private int cantidadUbre;
    private String colorDePelo;

    public Mamifero() {
        this.cantidadUbre = 0;
        this.colorDePelo = "negro";
    }
    
    public Mamifero(int cantidadUbre, String colorDePelo) {
        this.cantidadUbre = cantidadUbre;
        this.colorDePelo = colorDePelo;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public int getCantidadUbre() {
        return cantidadUbre;
    }

    public void setCantidadUbre(int cantidadUbre) {
        this.cantidadUbre = cantidadUbre;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "cantidadUbre=" + cantidadUbre + ", colorDePelo=" + colorDePelo + '}';
    }

    // sobre escritura 
    @Override
    public void comer() {
        System.out.println("El mamifero come");
    }
    
    // sobrecarga de metodos
    public void beber()
    {
        System.out.println("El Mamifero bebe agua");
    }
    public void beber(String liquido)
    {
        System.out.println("El Mamifero bebe " + liquido);
    }    
    public void beber(String liquido, int litros)
    {
        System.out.println("El Mamifero bebe " + litros + " litro(s) de " + liquido);
    }
    
    
    
}
