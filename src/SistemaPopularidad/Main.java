package SistemaPopularidad;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cancion ciudadMaica = new Cancion("Ciudad Mágica", new Album(), 5, new Normal(), 0, 0, LocalDate.now());
        System.out.println(ciudadMaica.getNombre());
        System.out.println(ciudadMaica.getAlbum().getNombre());
        System.out.println(ciudadMaica.getReproducciones());
    }
}
