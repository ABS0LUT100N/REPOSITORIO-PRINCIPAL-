import libreria.Biblioteca;
import libreria.Libro;

public class App {
    public static void main(String[] args) {
    
            Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
            biblioteca1.anadirLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Sudamericana", "858.67 M566"));
            biblioteca1.anadirLibro(new Libro("Rayuela", "Julio Cortazar", 1963, "Sudamericana", "863.55 J667"));
            biblioteca1.anadirLibro(new Libro("La Tía Julia y el Escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23 L567"));
            biblioteca1.listarLibro();


    }
}
