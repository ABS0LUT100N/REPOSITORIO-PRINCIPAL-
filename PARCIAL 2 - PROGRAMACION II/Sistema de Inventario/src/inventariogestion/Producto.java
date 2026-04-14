package inventariogestion;

public class Producto {

    private String nombre;
    private int stock;
    private int identificacion;

    public Producto(String nombre, int stock, int identificacion) {
        this.nombre = nombre;
        this.stock = stock;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getstock() {
        return stock;
    }

    public void setstock(int stock) {
        this.stock = stock;
    }

    public void imprimir() {

        System.out.println("Producto: " + nombre);
        System.out.println("stock: " + stock);
        System.out.println("ID: " + identificacion);
    }

    public int stockadd(){

        stock++;
        return stock;
    }

    public int stockremove(){

        stock--;

        return stock;
    }

    public int getIdentificacion() {
        return identificacion;
    }



    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

}
