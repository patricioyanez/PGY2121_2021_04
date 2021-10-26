
package listareproduccion;

import java.util.ArrayList;


public class ListaDeCanciones {
    
    private ArrayList<Cancion> lista;

    public ListaDeCanciones() {
        this.lista = new ArrayList<Cancion>();
    }
    
    public boolean agregar(Cancion cancion)
    {
        // validar si esta la cancion
        // validar si es cancion valida
        // validar si el genero es correcto
        return this.lista.add(cancion);              
    }
    public void listar()
    {
        for(Cancion cancion: lista)
        {
            System.out.println(cancion);
            //System.out.println(cancion.getTitulo() + " " + cancion.getArtista().getNombre());
        }
    }
    
    
}
