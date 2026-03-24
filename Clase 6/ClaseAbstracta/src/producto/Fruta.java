package producto;

   public class Fruta extends Producto{

    public Fruta(double precio, int ID) {
        super(precio, ID);
    }

    @Override
    public double CalcularPrecio() {
     return 0;
    }

    @Override
    public void getDetalle() {
     
    }

    @Override
    public void descripcionProducto() {

    }

     }
