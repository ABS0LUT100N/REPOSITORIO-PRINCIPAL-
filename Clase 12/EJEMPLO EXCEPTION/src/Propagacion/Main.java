package Propagacion;

import Excepcion.ProductoException;

public class Main {

    public static void main(String[] args) {
        ServicioProducto servicio = new ServicioProducto();

        try {

            servicio.procesarProducto("Papas");
            servicio.procesarProducto(null);

        } catch (ProductoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
