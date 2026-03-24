package animales;
import interfaz.Vender;

public abstract  class Animal implements Vender {

        protected String raza;
        protected String nombre;
        protected int edad;
        protected int peso;
        protected int ID;
        protected int precio;
        protected double Total;
        protected int cantidad;

    // constructor

    public Animal (int ID, String raza) {

        this.ID = ID;
        this.raza = raza;

    }

    // metodos abstractos

    public abstract void alimentarAnimal();

    // metodos normales

    @Override
    public String toString() {
        return "Raza del animal: " + raza + "\nEdad del animal: " + edad + "\nPeso del animal: " + peso + "\nIdentificación del animal: " + ID + "\nPrecio de venta: $" + precio + "Nombre del animal: " + nombre;
    }

       public void getDetalle() {

       System.out.println( "Raza del animal:" + raza + "\nPeso del animal:" + peso + "\nIdentificación del animal:" + ID + "\nPrecio de venta:" + this.CalcularPrecio());

       }

    // getters y setters

    public String getRaza() {
        return raza;
    }


    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public int getID() {
        return ID;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setID(int iD) {
        this.ID = ID;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

   

    
    
}
