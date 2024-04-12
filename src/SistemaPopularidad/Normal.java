package SistemaPopularidad;

public class Normal extends Popularidad{
    private int cantReproducciones;
    private static int cantMaxReproducciones = 1000;
    public Normal() {
        cantReproducciones = 0;
    }

    public void actEstado(Cancion c) {
        cantReproducciones++;
        if (cantReproducciones > cantMaxReproducciones){
           c.setPopularidad(new Auge());
        }
    }

    protected String icono() {
        return Icono.getMusicalNote().texto();
    }

    protected String leyenda(Cancion c) {
        return c.getAlbum().getArtista().getNombre() + " - " + c.getAlbum().getNombre() + " - " + c.getNombre();
    }
}
