        import sistemapeaje.*;
        import java.util.Scanner;
        import java.util.ArrayList;
        import java.util.List;

        public class App {
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Vehiculo> vehiculos = new ArrayList<>();
        List<Carro> carros = new ArrayList<>();
        List<Camion> camiones = new ArrayList<>();

    
        //------------------------------------------------------------------------------------------
        //                                         MAIN MENU
        //------------------------------------------------------------------------------------------

        int opcion = -1;

        do{

        System.out.println(""" 
        ____________________________________________________________________________

                                       PEAJES - MENÚ
        ____________________________________________________________________________
                """);

           System.out.println("""

        ----------------------------------------------------------------------------
        
        1. Agregar vehículo.
        2. Calcular total de peaje.
        3. Salir.

        ----------------------------------------------------------------------------

                                Por favor, elegir una opción:
                                
        ----------------------------------------------------------------------------
                
                """); 
                

        opcion = sc.nextInt();

        agregarVehiculo(opcion, sc, camiones, carros, vehiculos);

        } while (opcion != 3);

        }

        public static void agregarVehiculo(int opcion, Scanner sc, List<Camion> camiones, List<Carro> carros, List<Vehiculo> vehiculos){

            do {

            switch (opcion) { 

            case 1:

              System.out.println("""
                ----------------------------------------------------------------------------

                ¿Es el vehículo un automóvil o un camión?

                1. Automóvil.
                2. Camión.
                0. Salir.

                ----------------------------------------------------------------------------
                """);

                opcion = sc.nextInt();

                if(opcion == 1){agregarUnCarro(sc, 1,carros);}
                if(opcion == 2){agregarUnCamion(sc, 2,camiones);}
                if(opcion == 3){System.out.println("\n                           bye byeee!!!!\n");}

              break;

              case 2:

              System.out.println("\n-------------------------------------------------------------------------------\n");
              System.out.println("\n______________________________________________________\n");

              Peaje peaje = new Peaje("Estación 1", "Valle del Cauca");
              System.out.println("Cantidad de carros: " + carros.size());
              System.out.println("Cantidad de camiones: " + camiones.size());
              peaje.imprimir();

              System.out.println("\n______________________________________________________\n");

              
              break;

              case 3:

              System.out.println("\n__________________________________________________________________________________\n");
              System.out.println("                                  bye byeee!!!!");
              System.out.println("\n__________________________________________________________________________________\n");

              break;

              default: 

              System.out.println("\n________________________________________________________________________________________\n");
              System.out.println("\n                       Lo lamento, la opción no es válida\n");
              System.out.println("\n________________________________________________________________________________________\n");

              break;

            } 
            } while (opcion != 0);  
    
         
         
    
    }

         //------------------------------------------------------------------------------------------
         //                                         METODOS
         //------------------------------------------------------------------------------------------

    public static void agregarUnCarro(Scanner sc, int opcion, List<Carro> carros) {

        
        System.out.println("\n________________________________________________________________________________________\n");
        System.out.println("Por favor, ingresar la placa del automóvil: ");
        System.out.println("\n________________________________________________________________________________________\n");

        sc.nextLine();
        String placa = sc.nextLine();

                
        System.out.println("\n---------------------------------------------------------------------------------\n");
        System.out.println("                                  Automóvil añadido!!!!");
        System.out.println("\n---------------------------------------------------------------------------------\n");
 
        Carro carro = new Carro(placa);

        System.out.println("\n---------------------------------------------------------------------------------\n");
        carro.setPlaca(placa);
        carro.getValorPeaje();
        carro.imprimir();
        carros.add(carro);
        System.out.println("\n---------------------------------------------------------------------------------\n");

    }


    public static void agregarUnCamion(Scanner sc, int opcion, List<Camion> camiones) {

        System.out.println("\n________________________________________________________________________________________\n");
        System.out.println("Por favor, ingresar la placa del automóvil: ");
        System.out.println("\n________________________________________________________________________________________\n");

        sc.nextLine();
        String placa = sc.nextLine();

        System.out.println("¿Cúantos ejes tiene su camión?");

        int ejes = sc.nextInt();

        System.out.println("\n________________________________________________________________________________________\n");

        System.out.println("\n---------------------------------------------------------------------------------\n");
        System.out.println("                                  Camión añadido!!!!");
        System.out.println("\n---------------------------------------------------------------------------------\n");

        Camion camion = new Camion(placa, ejes);

        System.out.println("\n---------------------------------------------------------------------------------\n");
        camion.setNumerosEjes(ejes);
        camion.setPlaca(placa);
        System.out.println("Valor del peaje total: $" + camion.getValorPeaje());
        camion.getValorPeaje();
        camion.imprimir();
        camiones.add(camion);
        System.out.println("\n---------------------------------------------------------------------------------\n");

    }

    }

    
