package SistemaPopularidad;

import java.time.LocalDate;

public class Tendencia extends Popularidad{
    private int cantReproducciones;

    public void moverANormalSiEsPosible(Cancion c) {
        // c.setPopularidad(new Normal());

    }
    public void actEstado(Cancion c) {
        c.setUltReproducida(LocalDate.now());
    }


    protected String icono() {
        return "";
    }


    protected String leyenda(Cancion c) {
        return "";
    }
}
