public class MiPlaylist {
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen", 355);
        Cancion cancion2 = new Cancion("Stairway to Heaven", "Led Zeppelin", 482);
        Cancion cancion3 = new Cancion("Hotel California", "Eagles", 391);

        
        System.out.println("--- Mi Playlist ---");
        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();
        System.out.println("-------------------");

        
        System.out.println(cancion1.obtenerDetalles());
    }
}