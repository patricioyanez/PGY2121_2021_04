
package colaboracion;

import java.util.Date;


public class Entrada {
    
    private int numero;
    private int asiento;
    private Date fecha;
    private int valor;
    private Persona persona;

    public Entrada() {
        this.numero = 0;
        this.asiento = 0;
        this.fecha = new Date();
        this.valor = 0;
        this.persona = new Persona();
    }
    
    public Entrada(int numero, int asiento, Date fecha, int valor, Persona persona) {
        this.numero = numero;
        this.asiento = asiento;
        this.fecha = fecha;
        this.valor = valor;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "======= Entrada:\n" + 
                "numero=" + numero + 
                ", asiento=" + asiento + 
                ", fecha=" + fecha + 
                ", valor=" + valor + 
                ", persona=" + persona;
    }
    
    
    
}
