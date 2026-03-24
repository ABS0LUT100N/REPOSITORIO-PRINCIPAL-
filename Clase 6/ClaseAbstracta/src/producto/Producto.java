package producto;
import interfaz.Vender;

public abstract class Producto implements Vender{

     protected String nombre;
     protected double precio;
     protected int ID;
     protected String claseProducto;
     protected int cantidad;
     protected double peso;
     protected double Total;


    public Producto(double precio,int ID){

        this.precio = precio;
        this.ID = ID;

    }

     public abstract void descripcionProducto();


     @Override
     public String toString() {
       return "Nombre del producto: " + nombre + "\nPrecio del producto: $" + precio +"\nIdentificación del producto: " + ID + "\nClase de producto: " + claseProducto;
    }

     public void getDetalle(){

        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: $" + precio);
        System.out.println("Código del producto: " + ID);
        System.out.println("Peso del producto: " + peso);
        
    }

     public String getNombre() {
        return nombre;
    }

     public double getPrecio() {
        return precio;
    }

     public int getID() {
        return ID;
    }

     public String getClaseProducto() {
        return claseProducto;
    }

     public int getCantidad() {
        return cantidad;
    }

     public double getTotal() {
        return Total;
    }

     public double getPeso() {
         return peso;
     }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public void setPrecio(double precio) {
        this.precio = precio;
    }

     public void setID(int iD) {
        this.ID = ID;
    }

     public void setClaseProducto(String claseProducto) {
        this.claseProducto = claseProducto;
    }

     public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

     public void setTotal(double total) {
        Total = total;
    }

     public void setPeso(double peso) {
         this.peso = peso;
     }

    

}