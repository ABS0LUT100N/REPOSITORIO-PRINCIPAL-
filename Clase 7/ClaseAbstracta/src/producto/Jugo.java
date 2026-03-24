package producto;
import interfaz.*;

    public class Jugo extends Producto{

        public Jugo(double precio, int ID) {
            super(precio, ID);
        }

     @Override
     public void getDetalle() {
     }

     @Override
     public double CalcularPrecio() {
        return 0 ;
       
     }

     @Override
     public void descripcionProducto() {
     
     }
    
}
