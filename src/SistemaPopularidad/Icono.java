package SistemaPopularidad;

public class Icono {
    public static Icono MusicalNote = new Icono(new int[]{0xD83C,0xDFB5});
    public static Icono Rocket = new Icono(new int[]{0xD83D,0xDE80});
    public static Icono Fire = new Icono(new int[]{0xD83D, 0xDD25});
    private int[] internalEncoding;

    Icono(int[] internalEnconding){
        this.internalEncoding = internalEnconding;
    }

    public static Icono getMusicalNote() {
        return MusicalNote;
    }

    public static void setMusicalNote(Icono musicalNote) {
        MusicalNote = musicalNote;
    }

    public static Icono getRocket() {
        return Rocket;
    }

    public static void setRocket(Icono rocket) {
        Rocket = rocket;
    }

    public static Icono getFire() {
        return Fire;
    }

    public static void setFire(Icono fire) {
        Fire = fire;
    }

    public int[] getInternalEncoding() {
        return internalEncoding;
    }

    public void setInternalEncoding(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto(){
        return new String(internalEncoding, 0, internalEncoding.length);
    }

    public static void main(String[] args){
        System.out.println(Icono.MusicalNote.texto());
        System.out.println(Icono.Rocket.texto());
        System.out.println(Icono.Fire.texto());
    }
}
