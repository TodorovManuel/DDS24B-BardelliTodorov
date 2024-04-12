package SistemaPopularidad;

public abstract class Popularidad {
    public abstract void actEstado(Cancion c);
    protected abstract String icono();
    protected abstract String leyenda(Cancion c);

    public String detalleCompleto(Cancion c){
        String texto = "";

        texto += icono();
        texto += " - ";
        texto += leyenda(c);

        return texto;
    }
}
