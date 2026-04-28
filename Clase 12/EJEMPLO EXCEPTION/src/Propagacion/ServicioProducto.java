package Propagacion;

import Excepcion.ProductoException;

public class ServicioProducto {

    public void procesarProducto(String nombre) throws ProductoException {

        agregarProducto(nombre);
    }

    private void agregarProducto(String nombre) throws ProductoException {

        if (nombre == null || nombre.isBlank()) {
            throw new ProductoException("Producto inválido");
        }
        System.out.println("Producto Agregado: " + nombre);
    }
}
