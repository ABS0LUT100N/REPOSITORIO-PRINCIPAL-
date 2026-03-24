    package libreria;

    public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private String referencialBibliografica;

    public Libro(String titulo, String autor, int añoPublicacion, String editorial, String referenciaBibliografica) {

        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.referencialBibliografica = referenciaBibliografica;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getReferencialBibliografica() {
        return referencialBibliografica;
    }

    public void setReferencialBibliografica(String referencialBibliografica) {
        this.referencialBibliografica = referencialBibliografica;
    }

    public void imprimir() {

        System.out.println("\n____________________________________________________\n");

        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Editorial del libro: " + editorial);
        System.out.println("Referencia bibliográfica: " + referencialBibliografica);

        System.out.println("\n____________________________________________________\n");

        
    }


    }