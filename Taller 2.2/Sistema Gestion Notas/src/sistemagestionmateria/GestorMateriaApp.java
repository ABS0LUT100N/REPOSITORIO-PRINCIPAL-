    package sistemagestionmateria;

    import java.util.ArrayList;
   import java.util.List;
    import java.util.Scanner;
    import Interfaces.GestorMateria;    

    public class GestorMateriaApp {

    private List<Docente> profesores;
    private List<Estudiante> estudiantes;
    
    Scanner sc = new Scanner(System.in);

    Estudiante estudiante1 = new Estudiante("Natalia Erazo Lozano", 18, "Femenino", 1107848515, "3303D");

    Docente docente1 = new Docente("Santiago Camino Muñoz", 21, "Masculino", 1234567890);

    public GestorMateriaApp() {
       
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void start() {

        int opcion = -1;

        estudiantes.add(estudiante1);
        profesores.add(docente1);

        do{

             System.out.print("""
                    ---------------------------------------------
                        (^-^)/  SISTEMA DE GESTIÓN DE NOTAS
                    ---------------------------------------------

                    1. Agregar Profesor
                    2. Mostrar listado de profesores
                    3. Agregar materia
                    4. Registrar o modificar notas de una materia
                    5. Mostrar materias
                    6. Mostrar promedio general
                    0. Salir

                    *********************************************
                    Seleccione una opcion: """);
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    
                agregarProfesor();
                    
                    break;

                case 2:
                    System.out.println("\n----------------- Profesores ------------------");

                for (Docente docente : profesores) {

                    docente.imprimir();
                    
                }
                    
                    break;
                
                case 3:

                System.out.println("\n----------------- Materias ------------------");
                
                for (Docente docente1 : profesores) {
                        System.out.println("Profesor: " + docente1.getNombre() + " Id:" + docente1.getIdentificacion());
                    }
                    System.out.println("\nIngrese la ID del profesor que se le asignara la Materia");
                    int IdProfesor = sc.nextInt();
                    boolean noEncontradoC = true;
                    int posicionC = 0;
                    for (Docente docente1 : profesores)  {

                        if (profesores.get(posicionC).getIdentificacion() == IdProfesor) {
                            docente1 = profesores.get(posicionC);
                            System.out.println("\n*********** TURNO ASIGNADOS! :)**********");
                            noEncontradoC = false;
                            
                        }
                        posicionC++;
                    }
                    if (noEncontradoC) {
                        System.out.println("No se encontro ese codigo de profesor");
                    }
                    
                    break;
                
                case 4:

                System.out.println("\n----------------- Registro Notas ------------------");

               
                    
                    break;
                
                case 5:
                    
                    break;

                case 6:
                    
                    break;

                case 0:
                    System.out.println("Bye, bye");
                    break;

                case 99:
                    
                    break;
            
                default:

                System.out.println("Opcion no valida");
                    
                    break;
            }

        }while ( opcion !=0 );

    


    }

    public void agregarProfesor(){

         int opcion;
        do {
            System.out.print("""
                    *******************************************
                    ¿Desea agregar un profesor?

                    1.Si
                    0.No

                    -------------------------------------------
                    Seleccione una opcion:""");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                 System.out.println("\nIngrese id del profesor:");
                    int identificacion = sc.nextInt();
                    System.out.println("Ingrese el nombre del profesor:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del profesor:");
                    int edad = sc.nextInt();
                    System.out.println("Ingrese el género del docente: ");
                    sc.nextLine();
                    String genero = sc.nextLine();


                    boolean noExiste = true; //Fue creada para evitar poner usuarios con el mismo ID
                    int posicionC = 0;


                    for (Docente docente : profesores) {

                        if (profesores.get(posicionC).getIdentificacion() == identificacion) {
                            System.out.println("Ese codigo de profesor ya existe y le pertenece a: ");
                            docente.imprimir();
                            noExiste = false;
                        }
                        posicionC++;

                    }

                    if (noExiste) {

                        Docente profe = new Docente(nombre, edad, genero, identificacion);
                        profesores.add(profe);
                        System.out.println("\n************ PROFESOR AÑADIDO ************");
                        profe.imprimir(); }
                        
                    break;
            
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            }while(opcion != 0);

    }
}
