
package colaboracion;

public class Persona {
    private int rut;
    private String nombre;
    private String comuna;
    
    // constructor
    
    public Persona() {
        this.rut = 0;
        this.nombre = "";
        this.comuna = "";
    }
    public Persona(int rut, String nombre, String comuna) {
        this.rut = rut;
        this.nombre = nombre;
        this.comuna = comuna;
    }
    // getter and setter
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    // metodos customer

    @Override
    public String toString() {
        return "Persona: \n" + 
                " rut: " + rut + 
                ", nombre: " + nombre + 
                ", comuna: " + comuna;
    }
    
    
    
    
}
