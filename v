public class MiPlaylist {
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion("ba ba bad", "Ryan castro", 227);
        Cancion cancion2 = new Cancion("i miss you", "beele", 254);
        Cancion cancion3 = new Cancion("not like us", "kendrick lamar", 434);

        
        System.out.println("--- Mi Playlist Valeria ---");
        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();
        System.out.println("-------------------");

        
        System.out.println(cancion1.obtenerDetalles());
    }
}