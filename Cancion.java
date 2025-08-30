public class Cancion {
   
    String titulo;
    String artista;
    int duracionSegundos;

    
    public Cancion(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " - " + artista);
    }

   
    public String obtenerDetalles() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracionSegundos + " segundos.";
    }
}