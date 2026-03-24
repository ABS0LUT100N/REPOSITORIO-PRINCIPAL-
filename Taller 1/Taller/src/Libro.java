public class Libro {

    private String titulo;
    private String autor;
    private String propietario;
    private double precio;

 //Constructor

 public void Imprimir(){
    System.out.println("\n ----------------------------- \n");
    System.out.println("Título: " + titulo + "\nAutor(es): " + autor + "\nPrecio ($): " + precio + "\nPropietario: " + propietario);
 }

    public Libro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getPropietario() {
        return propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    
}
