    package SistemaDeGestionTurnos;

    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    import InterfacesGestion.GestorTurnos;

    public class TurnosApp {

        private GestorTurnos gestorTurnos;
        private List<Empleado> empleados;
        private List<Cliente> clientes;

        public TurnosApp(GestorTurnos gestorTurnos) {

            this.gestorTurnos = gestorTurnos;
            this.empleados = new ArrayList<>();
            this.clientes = new ArrayList<>();
        }

        
        Cliente cliente1 = new Cliente("Natalia Erazo Lozano", 1107848515, 18);
        Cliente cliente2 = new Cliente("Santiago Camino Muñoz", 1108639397, 21);
        Cliente cliente3 = new Cliente("Jotaro Kujo", 123456789, 17);

        Empleado empleado1 = new Empleado("Sonic the Hedgehog", 1991, 35, "Cajero");
        Empleado empleado2 = new Empleado("Kirby Popstar", 1992, 34, "Administrador");
        
        
        Scanner sc = new Scanner(System.in);

    public void start() {

        // MENÚ DEL PROGRAMA !! :D



        int option = -1;

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        empleados.add(empleado1);
        empleados.add(empleado2);

        do {

            System.out.println("""

                    .......................................................

                                SISTEMA DE GESTIÓN DE TURNOS !!

                    .......................................................

                    1. Registrar cliente(s).
                    2. Registrar empleado(s).
                    3. Crear turno para cliente(s).
                    4. Atender siguiente turno.
                    5. Mostrar turnos pendientes.
                    6. Mostrar turnos atendidos.
                    0. Salir.

                    .......................................................

                    - Por favor, seleccione una opción:""");
            option = sc.nextInt();

            switch (option) {


                case 1:
                    
                    System.out.println("**************** CLIENTES !! ****************");

                    agregarCliente();

                    break;

                case 2:

                System.out.println("**************** EMPLEADOS !! ****************");

                    agregarEmpleado();
                    
                    break;
            
                case 3:

                System.out.println("**************** TURNOS !! ****************");
                    
                LocalDate fecha = LocalDate.now();

                System.out.println("\n __________________ -- ID DE LOS CLIENTES -- __________________ \n");

                for (Cliente cliente : clientes) {
                    System.out.println("Cliente: " + cliente.getNombre());
                    System.out.println("Identificación: " + cliente.getIdentificacion());
                    System.out.println("\n ____________________________________________________________________ \n"); }
                System.out.println("Por favor, ingrese la ID del cliente que se le asignará el turno:");
                int IdCliente = sc.nextInt();
                
                boolean notFoundClient = true;
                int positionClient = 0;

                for (Cliente ClienteE : clientes) {

                    if (clientes.get(positionClient).getIdentificacion() == IdCliente) {

                    ClienteE = clientes.get(positionClient);

                    System.out.println("\n : : : : : : : : : TURNO ASIGNADO !! : : : : : : : : : \n");
                    gestorTurnos.agregarTurno(ClienteE, fecha);
                    notFoundClient = false;
                    positionClient ++; }

                if (notFoundClient) {

                    System.out.println("-- No se encontró el código de ese cliente... --");
                }
                    
                }
                    
                    break;
                
                case 4:

                System.out.println("\n __________________ -- ID DE LOS EMPLEADOS -- __________________ \n");
                for (Empleado empleado : empleados) {
                    System.out.println("Empleado: " + empleado.getNombre());
                    System.out.println("Identificación: " + empleado.getIdentificacion());
                    System.out.println("\n ____________________________________________________________________ \n"); }
                System.out.println("Por favor, ingrese la ID del empleado que se le asignará el turno:");
                int IdEmpleado = sc.nextInt();
                
                boolean notFoundEmployeer = true;
                int positionEmployeer = 0;

                for (Empleado EmpleadoE : empleados) {

                    if (empleados.get(positionEmployeer).getIdentificacion() == IdEmpleado) {

                    EmpleadoE = empleados.get(positionEmployeer);
                    gestorTurnos.atenderTurno(EmpleadoE);
                    notFoundEmployeer = false;
                }} positionEmployeer ++;

                if (notFoundEmployeer) {

                    System.out.println("-- No se encontró el código de ese empleado... --");
                }
                    
                    break;

                case 5:

                System.out.println("**************** TURNOS PENDIENTES !! ****************");
                gestorTurnos.mostrarTurnosPendientes();
                    
                    break;
            
                case 6:

                System.out.println("**************** TURNOS ATENDIDOS !!  ****************");
                gestorTurnos.mostrarTurnosAtendidos();

                    break;

                default:

                    System.out.println("\n ---------------------------------- \n");
                    System.out.println(" -- Opción no válida :( -- ");
                    System.out.println("\n ---------------------------------- \n");

                    break;
            }

        } while (option != 0);
    
    }

        public void agregarCliente() {

        int option = -1;

        do {

            System.out.println("""
                    -------------------------------------------
                    ¿Desea agregar un cliente?

                    1- Si.
                    0- No.

                    -------------------------------------------
                    Por favor, seleccione una opcion:""");

            option = sc.nextInt();

            switch (option) {

                case 1:

                    System.out.println("\nIngrese ID del cliente:");
                    int id = sc.nextInt();
                    System.out.println("Ingrese el nombre del cliente:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del cliente:");
                    int edad = sc.nextInt();

                    boolean notExists = true; 
                    int positionClient = 0;

                    for (Cliente cliente : clientes) {

                        if (clientes.get(positionClient).getIdentificacion() == id) {
                            System.out.println("Ese codigo de cliente ya existe y le pertenece a: ");
                            cliente.imprimir();
                            notExists = false;
                        }
                        positionClient++;

                    }

                    if (notExists) {

                        Cliente cliente = new Cliente(nombre, id, edad);
                        clientes.add(cliente);
                        System.out.println("\n**************** CLIENTE AÑADIDO ****************");
                        cliente.imprimir(); 

                    }

                    break;
                case 0:
                    System.out.println("\n-------------- LISTA DE CLIENTES --------------");
                    for (Cliente cliente1 : clientes) {

                        cliente1.imprimir();
                    }

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        } while (option != 0);

    }

    public void agregarEmpleado() {

        
        int option = -1;

        do {

            
            System.out.println("""
                    -------------------------------------------
                    ¿Desea agregar un empleado?

                    1- Si.
                    0- No.

                    -------------------------------------------
                    Por favor, seleccione una opcion:""");

         switch (option) {

                case 1:

                 System.out.println("\nIngrese el ID del empleado:");
                    int id = sc.nextInt();
                    System.out.println("Ingrese el nombre del empleado:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del empleado:");
                    int edad = sc.nextInt();
                    System.out.println("Ingresar el cargo del empleado:");
                    sc.nextLine();
                    String puesto = sc.nextLine();

                    boolean notExists = true;
                    int positionEmployeer = 0;

                    for (Empleado empleado : empleados) {

                        if (empleados.get(positionEmployeer).getIdentificacion() == id) {
                            System.out.println("Ese codigo de empleado ya existe pertenece a:");
                            empleado.imprimir();
                            notExists = false;
                        }
                        positionEmployeer++;

                    }

                    if (notExists) {

                        Empleado empleado = new Empleado(nombre, id, edad, puesto);
                        System.out.println("\n**************** EMPLEADO AÑADIDO ****************");
                        empleados.add(empleado);
                        empleado1.imprimir();}

                    
                    break;
            
                case 0:

                
                    System.out.println("\n-------------- LISTA DE EMPLEADOS --------------");
                    for (Empleado empleado1 : empleados) {
                        empleado1.imprimir();}  
                    break;


                default:

                System.out.println("Opción no válida.");
                    break; }


        } while (option != 0);

      }

    }