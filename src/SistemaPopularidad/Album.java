package SistemaPopularidad;

import java.util.HashSet;

public class Album {
    private Artista artista;
    private HashSet<Cancion> canciones;
    private String nombre;

    public Album(Artista artista, HashSet<Cancion> canciones, String nombre) {
        this.artista = artista;
        this.canciones = canciones;
        this.nombre = nombre;
    }

    public Album(){
        artista = new Artista();
        canciones = new HashSet<>();
        nombre = "Destinología";
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCancion(Cancion c){
        canciones.add(c);
    }
}
