package animales;
import interfaz.*;

    public class Gallina extends Animal {

     public Gallina(int ID, String raza) {
        super(ID, raza);
    }

     @Override
     public void alimentarAnimal() {

        System.out.println("\nSe alimenta con semillas de cualquier tipo que puedan digerir");

    }
    
    public double CalcularPrecio(){
        return precio*cantidad;
     }

   
       @Override
       public void getDetalle() {

       System.out.println("Raza del animal:" + raza + "\nPeso del animal:" + peso + "\nIdentificación del animal:" + ID + "\nPrecio de venta:" + this.CalcularPrecio()); 

       }
}
