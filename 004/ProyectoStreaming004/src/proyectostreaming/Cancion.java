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
    private int segundos;
    private Boolean esFavorita;
    private Boolean fueDescargada;
    
    
    // constructores

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.segundos = 0;
        this.esFavorita = false;
        this.fueDescargada = false;
    }

    public Cancion(String titulo, String artista, int segundos, Boolean esFavorita, Boolean fueDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.segundos = segundos;
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

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
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
    
    // customer
    
    public int adelantar(int tiempo)
    {
        return tiempo += 5;
    }

    public String imprimir() {
        return "*********************\nCancion:" + "\n" +
                "titulo=" + titulo +  "\n" +
                "artista=" + artista +   "\n" +
                "minutos=" + (segundos/60) + (segundos%60) +  "\n" +
                "es Favorita=" + (esFavorita?"si":"no") +  "\n" +
                "fue Descargada=" + (fueDescargada?"Si":"no");
    }
    
    public String cancionExtendida()
    {
        if(segundos > 300)
            return "Extendida";
        else
            return "Corta";
    } 
    
    
}
