package inventariogestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import interfazgestion.*;

public class GestorInventarioImplementacion implements GestorInventario {

    Scanner sc = new Scanner(System.in);

    private List<Movimiento> movimientos;

    public GestorInventarioImplementacion() {

        this.movimientos = new ArrayList<>();

    }

    @Override
    public void entradaProductos(Producto producto) {

        System.out.println("\n ------------------------------------------------ \n");
        System.out.println("Ingresar la fecha: ");
        String fecha = sc.nextLine();
        System.out.println("\n ------------------------------------------------ \n");

        
        System.out.println("\n ------------------------------------------------ \n");
        System.out.println("Producto agregado!");
        System.out.println("\n ------------------------------------------------ \n");
        String entrada = "Entrada";

        Movimiento productoo = new Movimiento(producto, fecha, entrada);
        movimientos.add(productoo);
        productoo.imprimir();
        producto.stockadd();
        System.out.println("Fecha de movimiento: " + fecha);
        System.out.println("Stock: " + producto.getstock());

    }

    @Override
    public void salidaProductos(Producto producto) {

        if (movimientos.isEmpty()) {
            System.out.println("-- No hay productos disponibles, no se puede realizar la salida. --");
        } else {
            if (producto.getstock() == 0) {
                System.out.println("No se puede realizar la salida.");
            } else {
                System.out.println("\n ------------------------------------------------ \n");
                System.out.println("Ingresar la fecha: ");
                System.out.println("\n ------------------------------------------------ \n");

                String fecha = sc.nextLine();
                sc.nextLine();
                System.out.println("\n ------------------------------------------------ \n");
                System.out.println("Producto removido!");
                System.out.println("\n ------------------------------------------------ \n");
                String entrada = "Salida";

                Movimiento productoo = new Movimiento(producto, fecha, entrada);
                movimientos.add(productoo);
                productoo.imprimir();
                producto.stockremove();
                System.out.println("Fecha de movimiento: " + fecha);
                System.out.println("Stock: " + producto.getstock());
            }

        }

    }

    @Override
    public void estadoInventario() {


        if (movimientos.isEmpty()) {
            System.out.println("\n ------------------------------------------------ \n");
            System.out.println("No hay inventario.");
            System.out.println("\n ------------------------------------------------ \n");
        } else {
            for (Movimiento movee : movimientos) {
                movee.imprimir();
            }
        }

    }

    @Override
    public void movimientoHistorial() {


        if (movimientos.isEmpty()) {
            System.out.println("\n ------------------------------------------------ \n");
            System.out.println("No hay historial.");
            System.out.println("\n ------------------------------------------------ \n");
        } else {
            for (Movimiento movee : movimientos) {
                movee.imprimir();
            }
        }

    }

}
