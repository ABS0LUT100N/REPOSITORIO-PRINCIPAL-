package interfazgestion;

import inventariogestion.*;

public interface GestorInventario {
    
 public void entradaProductos(Producto producto);
 public void salidaProductos(Producto producto);
 public void estadoInventario();
 public void movimientoHistorial();

}
