
package zoologico;


public class Animal {
    private int ojos;
    private String nombre;
    private String nombreCientifico;

    public Animal() {
        this.ojos = 0;
        this.nombre = "";
        this.nombreCientifico = "";
    }
    
    public Animal(int ojos, String nombre, String nombreCientifico) {
        this.ojos = ojos;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "ojos=" + ojos + ", nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + '}';
    }
    
    public void comer()
    {
        System.out.println("el animal come");
    }
    
}
