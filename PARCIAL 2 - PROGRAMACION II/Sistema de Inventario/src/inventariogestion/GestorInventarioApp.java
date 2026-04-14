package inventariogestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfazgestion.*;

public class GestorInventarioApp {

    private GestorInventario gestorInventario;
    private Administrador admin;
    private List<Producto> producto;

    public GestorInventarioApp(GestorInventario gestorInventario) {

        this.gestorInventario = gestorInventario;
        this.admin = admin;
        this.producto = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    Administrador admin1 = new Administrador("Natalia Erazo Lozano", 1107848515);
    Producto producto1 = new Producto("Sandwich de jamón", 0, 1234);
    Producto producto2 = new Producto("Jugo de naranja", 0, 5678);

    public void start() {

        int opcion = -1;
        producto.add(producto1);
        producto.add(producto2);

        do {

            System.out.print("""
                    *******************************************
                               SISTEMA DE INVENTARIO
                    *******************************************
                    1. Registrar entrada del producto
                    2. Registrar salida del producto
                    3. Ver estado del inventario
                    4. Ver historial de movimiento
                    0. Salir
                    -------------------------------------------
                    Seleccione una opcion: """);
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("""

                            ------------------------------------------------
                                          ENTRADA DEL PRODUCTO
                            ------------------------------------------------
                                   """);

                    System.out.println("\n ------------------------------------------------ \n");
                    System.out.println("Productos disponibles:");
                    for (Producto productoo : producto) {
                        System.out
                                .println("Nombre: " + productoo.getNombre() + " ID: " + productoo.getIdentificacion());
                    }
                    System.out.println("\n ------------------------------------------------ \n");

                    System.out.println("Por favor, ingrese la ID del producto que va a entrar: ");
                    int idProducto = sc.nextInt();
                    boolean noEncontradoP = true;
                    int posicionP = 0;

                    for (Producto productoo : producto) {

                        if (producto.get(posicionP).getIdentificacion() == idProducto) {
                            productoo = producto.get(posicionP);
                            gestorInventario.entradaProductos(productoo);
                            System.out.println("\n ------------------------------------------------ \n");
                            System.out.println("Movimiento realizado por: " + admin1.getNombre());
                            System.out.println("\n ------------------------------------------------ \n");
                            noEncontradoP = false;

                        }
                        posicionP++;
                    }
                    if (noEncontradoP) {

                        System.out.println("No se encontró ese producto...");
                    }

                    break;

                case 2:

                    System.out.println("""

                            ------------------------------------------------
                                          SALIDA DEL PRODUCTO
                            ------------------------------------------------
                                   """);

                    System.out.println("\n ------------------------------------------------ \n");
                    System.out.println("Productos disponibles:");
                    for (Producto productoo : producto) {
                        System.out
                                .println("Nombre: " + productoo.getNombre() + " ID: " + productoo.getIdentificacion());
                    }
                    System.out.println("\n ------------------------------------------------ \n");

                    System.out.println("Por favor, ingrese la ID del producto que va a salir: ");
                    idProducto = sc.nextInt();
                    noEncontradoP = true;
                    posicionP = 0;

                    for (Producto productoo : producto) {

                        if (producto.get(posicionP).getIdentificacion() == idProducto) {
                            productoo = producto.get(posicionP);
                            gestorInventario.salidaProductos(productoo);
                            System.out.println("\n ------------------------------------------------ \n");
                            System.out.println("Movimiento realizado por: " + admin1.getNombre());
                            System.out.println("\n ------------------------------------------------ \n");
                            noEncontradoP = false;

                        }
                        posicionP++;
                    }
                    if (noEncontradoP) {

                        System.out.println("\n ------------------------------------------------ \n");

                        System.out.println("No se encontró ese producto...");
                        System.out.println("\n ------------------------------------------------ \n");
                    }

                    break;

                case 3:

                    System.out.println("""

                            ------------------------------------------------
                                        ESTADO DEL INVENTARIO
                            ------------------------------------------------
                                   """);

                    System.out.println("\n _______________________________________________________ \n");
                    System.out.println("Productos:");
                    for (Producto productoo : producto) {
                                productoo.imprimir();
                    }
                    System.out.println("\n _______________________________________________________ \n");
                    System.out.println("Movimientos recientes: ");
                    gestorInventario.estadoInventario();
                    System.out.println("\n ------------------------------------------------ \n");

                    break;

                case 4:

                    System.out.println("""

                            ------------------------------------------------
                                        HISTORIAL DE PRODUCTOS
                            ------------------------------------------------
                                   """);
                    System.out.println("\n ------------------------------------------------ \n");

                    gestorInventario.movimientoHistorial();
                    System.out.println("\n ------------------------------------------------ \n");
                    break;

                case 0:
                    System.out.println("-- Bye byee !! --");

                    break;

                default:
                    System.out.println("\n ------------------------------------------------ \n");
                    System.out.println("Opción no válida");
                    System.out.println("\n ------------------------------------------------ \n");
                    break;
            }

        } while (opcion != 0);

    }
}
