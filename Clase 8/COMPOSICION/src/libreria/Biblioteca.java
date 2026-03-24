    package libreria;

    import java.util.ArrayList;
    import java.util.List;

    public class Biblioteca {

    private String nombre;
    List<Libro> colecciondeLibros;

    public Biblioteca (String nombre){

        this.nombre = nombre;
        this.colecciondeLibros = new ArrayList<>();

    }


    
    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    


    public void anadirLibro (Libro libro) {

        colecciondeLibros.add(libro);
    }

    public void listarLibro () {

        System.out.println("\n------------------------------------------------\n");

        for (Libro libro :  colecciondeLibros) {
            libro.imprimir();
        }

        System.out.println("\n------------------------------------------------\n");

    }

    }


