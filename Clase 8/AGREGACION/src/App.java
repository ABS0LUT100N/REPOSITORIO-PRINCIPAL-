    
     public class App {
     public static void main(String[] args) {

        Producto tomate = new Producto(1, "Tómate", "Tómate de aspecto jugoso y saludable.", 500);
        Producto huevos = new Producto(2,"Panal de huevos", "Un panal de huevos AAA", 20000);
        Producto arroz = new Producto(3, "Paquete individual de arroz", "Semillas de arroz exportadas.", 2500);
 
        Orden orden1 = new Orden(1);
        orden1.añadirItem(1, 2, tomate);
        orden1.añadirItem(2, 4, huevos);
        orden1.añadirItem(3, 2, arroz);
        orden1.imprimir();

        System.out.println("Total: " + orden1.calcularTotalOrden());

        System.out.println("\n______________________________________________________\n ");
        

    }

    }
