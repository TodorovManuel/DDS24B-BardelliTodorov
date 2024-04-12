package SistemaPopularidad;

import java.time.LocalDate;

public class Cancion {
    private String nombre;
    private Album album;
    private int reproducciones;
    private Popularidad popularidad;
    private int likes;
    private int dislikes;
    private LocalDate ultReproducida;

    public Cancion(String nombre, Album album, int reproducciones, Popularidad popularidad, int likes, int dislikes, LocalDate ultReproducida) {
        this.nombre = nombre;
        this.album = album;
        this.reproducciones = 0;
        this.popularidad = popularidad;
        this.likes = 0;
        this.dislikes = 0;
        this.ultReproducida = ultReproducida;
    }

    public Cancion() {
        nombre = "Ciudad Mágica";
        album = new Album();
        reproducciones = 0;
        popularidad = new Normal();
        likes = 0;
        dislikes = 0;
        ultReproducida = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDate getUltReproducida() {
        return ultReproducida;
    }

    public void setUltReproducida(LocalDate ultReproducida) {
        this.ultReproducida = ultReproducida;
    }

    public void reproducir(){
        reproducciones++;
        popularidad.actEstado(this);
        ultReproducida = LocalDate.now();
    }

    public void detalleCompleto(){
        popularidad.detalleCompleto(this);
    }
}
