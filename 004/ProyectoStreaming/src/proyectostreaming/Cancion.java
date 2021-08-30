/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectostreaming;

/**
 *
 * @author patri
 */
public class Cancion {
    /// atributos
    private String titulo;
    private String artista;
    private int minutos;
    private Boolean esFavorita;
    private Boolean fueDescargada;
    
    
    // constructores

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.minutos = 0;
        this.esFavorita = false;
        this.fueDescargada = false;
    }

    public Cancion(String titulo, String artista, int minutos, Boolean esFavorita, Boolean fueDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.minutos = minutos;
        this.esFavorita = esFavorita;
        this.fueDescargada = fueDescargada;
    }
    
    // getter and setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Boolean getEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(Boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public Boolean getFueDescargada() {
        return fueDescargada;
    }

    public void setFueDescargada(Boolean fueDescargada) {
        this.fueDescargada = fueDescargada;
    }
    
    // costumer
    
    public int adelantar(int tiempo)
    {
        return tiempo += 5;
    }

    public String imprimir() {
        return "Cancion:" + "\n" +
                "titulo=" + titulo +  "\n" +
                "artista=" + artista +   "\n" +
                "minutos=" + (minutos/60) + (minutos%60) +  "\n" +
                "es Favorita=" + (esFavorita?"si":"no") + 
                "fue Descargada=" + (fueDescargada?"Si":"no");
    }
    
    public String cancionExtendida()
    {
        if(minutos > 300)
            return "Extendida";
        else
            return "Corta";
    }
    
    
    
}
