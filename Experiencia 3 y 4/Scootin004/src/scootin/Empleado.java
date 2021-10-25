/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scootin;

/**
 *
 * @author patri
 */
public class Empleado {
    private String rut;
    private String nombreCompleto;
    private String genero;
    private int anioDeServicios;
    private int edad;
    private Puesto puesto;
    
    public Empleado() {
        this.rut = "";
        this.nombreCompleto = "";
        this.genero = "";
        this.anioDeServicios = 0;
        this.edad = 0;
        this.puesto = new Puesto(); // opcional se puede asignar un null
    }
    public Empleado(String rut, String nombreCompleto, String genero, int anioDeServicios, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.anioDeServicios = anioDeServicios;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioDeServicios() {
        return anioDeServicios;
    }

    public void setAnioDeServicios(int anioDeServicios) {
        this.anioDeServicios = anioDeServicios;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado:\n " + 
                " rut             =" + rut + 
                ", nombreCompleto =" + nombreCompleto + 
                ", genero   =" + genero + 
                ", anioDeServicios=" + anioDeServicios + 
                ", edad=" + edad + 
                ", puesto=" + puesto;
    }
            
    
    
}
