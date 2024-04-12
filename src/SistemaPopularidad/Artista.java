package SistemaPopularidad;

import java.util.HashSet;

public class Artista {
    private String nombre;
    private HashSet<Album> albumes;

    public Artista(String nombre, HashSet<Album> albumes) {
        this.nombre = nombre;
        this.albumes = albumes;
    }

    public Artista(){
        nombre = "Messi";
        albumes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(HashSet<Album> albumes) {
        this.albumes = albumes;
    }
}
