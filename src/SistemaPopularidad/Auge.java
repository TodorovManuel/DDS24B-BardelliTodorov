package SistemaPopularidad;

public class Auge extends Popularidad{
    private int cantReproducciones;
    private static int cantMaxReproducciones = 50000;
    private static int maxLikes = 20000;
    private int dislikes;
    private static int maxDislikes = 5000;

    public Auge() {

    }

    public void actEstado(Cancion c) {

    }

    public Auge(int cantReproducciones, int dislikes) {
        this.cantReproducciones = cantReproducciones;
        this.dislikes = dislikes;
    }

    public int getCantReproducciones() {
        return cantReproducciones;
    }

    public void setCantReproducciones(int cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }

    public static int getCantMaxReproducciones() {
        return cantMaxReproducciones;
    }

    public static void setCantMaxReproducciones(int cantMaxReproducciones) {
        Auge.cantMaxReproducciones = cantMaxReproducciones;
    }

    public static int getMaxLikes() {
        return maxLikes;
    }

    public static void setMaxLikes(int maxLikes) {
        Auge.maxLikes = maxLikes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public static int getMaxDislikes() {
        return maxDislikes;
    }

    public static void setMaxDislikes(int maxDislikes) {
        Auge.maxDislikes = maxDislikes;
    }

    public void reproducir(Cancion c) {
        cantReproducciones++;
        if(cantReproducciones > cantMaxReproducciones && c.getLikes() > maxLikes) {
            c.setPopularidad(new Tendencia());
        } else if (dislikes > maxDislikes) {
            c.setPopularidad(new Normal());
        }
    }

    protected String icono() {
        return "";
    }


    protected String leyenda(Cancion c) {
        return "";
    }
}
