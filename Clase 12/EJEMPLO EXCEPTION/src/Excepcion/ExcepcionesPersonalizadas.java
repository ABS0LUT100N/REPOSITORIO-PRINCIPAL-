package Excepcion;
public class ExcepcionesPersonalizadas {

    public static void main(String[] args) {
        ExcepcionesPersonalizadas demo = new ExcepcionesPersonalizadas();

        try {
            demo.agregarProducto("Laptop");
            demo.agregarProducto("");
        } catch (ProductoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void agregarProducto(String nombre) throws ProductoException {
        if (nombre == null || nombre.isBlank()) {
            throw new ProductoException("No se puede agregar un producto sin nombre");
        }
        System.out.println("Agregando producto: " + nombre);
    }
}
