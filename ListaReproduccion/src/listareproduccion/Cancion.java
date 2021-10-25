/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listareproduccion;

/**
 *
 * @author patri
 */
public class Cancion {
    private String titulo;
    private Artista artista;
    private int duracion;
    private boolean esFavorita;
    private boolean estaDescargada;

    public Cancion() {
        this.titulo = "";
        this.artista = new Artista();
        this.duracion = 0;
        this.esFavorita = false;
        this.estaDescargada = false;
    }
    public Cancion(String titulo, Artista artista, int duracion, boolean esFavorita, boolean estaDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.esFavorita = esFavorita;
        this.estaDescargada = estaDescargada;
    }

    public boolean isEstaDescargada() {
        return estaDescargada;
    }

    public void setEstaDescargada(boolean estaDescargada) {
        this.estaDescargada = estaDescargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    @Override
    public String toString() {
        return "Cancion\n" + 
                "Titulo=" + titulo + 
                ", Artista=" + artista + 
                ", Duracion=" + duracion + 
                ", es Favorita=" + (esFavorita?"si":"no") + 
                ", esta Descargada=" + (estaDescargada?"si":"no");
    }
    
    
    
    
}
