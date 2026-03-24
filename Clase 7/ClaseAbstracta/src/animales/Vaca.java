package animales;
import interfaz.*;

    public class Vaca extends Animal {

     public Vaca(int ID, String raza) {
        super(0, null);
    }

     @Override
     public void alimentarAnimal() {

        System.out.println("\nSe alimenta con concentrados y hierbas de buena calidad.");

    }

       public double CalcularPrecio(){

         Total = (precio*peso*edad*0.5);

        return Total;
     }



}
