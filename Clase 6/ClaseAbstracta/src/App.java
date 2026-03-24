import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import animales.*;
import producto.*;
import interfaz.*;

    public class App {
     public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      List<Vender> ventas = new ArrayList<>();
      List<Producto> productos = new ArrayList<>();
      List<Animal> animales = new ArrayList<>();

      int opcion = -1;
      

      //------------------------------------------------------------------------------------------
      //                                         MAIN MENU
      //------------------------------------------------------------------------------------------


      System.out.println("""
            ------------------------------------------------------
                            Gestión de la granja
            ------------------------------------------------------

            """);

      do{

         System.out.println("""
            
            ------------------------------------------------------

            1. Agregar un nuevo producto.
            2. Agregar un nuevo animal.
            3. Gestionar las ventas.
            4. Mostrar informe.
            5. Salir.

            ------------------------------------------------------

            Por favor, eliga una opción:

            ------------------------------------------------------
               """);
            opcion = sc.nextInt();

            switch (opcion) {

               case 1:
                  System.out.println("\n------------------------------------------------------\n");
                  System.out.println("                  Agregar productos.\n");


                  agregarProducto(sc,productos);

                  break;
               case 2:
                  System.out.println("\n------------------------------------------------------\n");
                  System.out.println("                  Agregar Animales.\n");


                  agregarAnimal(sc,animales);

                  break;
               case 3:
                  System.out.println("Gestionar ventas.");
                  break;
               case 4:
                  System.out.println("Mostrar informe.");
                  break;
               case 0:
                  System.out.println("Salida... Bye bye!");
                  break;
            
               default:
                  System.out.println("Lo lamento, opción no válida.");
                  break;
            }


   } while (opcion != 0);
      
   }

   
      //------------------------------------------------------------------------------------------
      //                                  PRODUCTOS - Método
      //------------------------------------------------------------------------------------------



   public static void pedirDatosProducto (Scanner sc, List<Producto> productos, int opcion)
      
      {
          System.out.println("\n------------------------------------------------------\n");
          System.out.print("\nPor favor digite el precio del producto:\n");
            double precio = sc.nextDouble();
          System.out.println("\n------------------------------------------------------\n");

            System.out.print("\nPor favor digite la identificación del producto:\n");
            int codigo = sc.nextInt();
          System.out.println("\n------------------------------------------------------\n");
            
            System.out.print("\nPor favor digite el peso del producto:\n");
            double peso = sc.nextDouble();
          System.out.println("\n------------------------------------------------------\n");

            System.out.print("\nPor favor digite el nombre del producto:\n");
            sc.nextLine();
            String nombre = sc.nextLine();
          System.out.println("\n------------------------------------------------------\n");

         

          if (opcion == 1){ 

         Producto fruta = new Fruta(precio, codigo);
         fruta.setPeso(peso);
         fruta.setClaseProducto("Fruta");
         fruta.setNombre(nombre);
         productos.add(fruta);} 
         
         if (opcion == 2) { 
         
         Producto jugo = new Jugo(precio, codigo);
         jugo.setPeso(peso);
         jugo.setClaseProducto("Bebida natural");
         jugo.setNombre(nombre);
         productos.add(jugo);}

      }

      //------------------------------------------------------------------------------------------
      //                                         PRODUCTOS
      //------------------------------------------------------------------------------------------


   public static void agregarProducto(Scanner sc, List<Producto> productos) {

      int opcion=0;

       
      do {

      System.out.println("""
             ------------------------------------------------------
            
             Elija el tipo que desea agregar:

            1. Frutas.
            2. Bebidas naturales.
            0. Salir.

             ------------------------------------------------------
            """);

      System.out.println("Opción:");
      opcion = sc.nextInt();

      switch (opcion) {

         case 1:
            
         pedirDatosProducto(sc, productos, 1);
      
            break;
      
         case 2:
         
         pedirDatosProducto(sc, productos, 2);


         case 3:

            System.out.println("""
                 Sonic: Gotta go fast buddy!
                  """);
            break;

         case 0:
            System.out.println("\n______________________________________________________\n");
            System.out.println("""
                  Bye byeeee!!! :D
            """);
            System.out.println("\n______________________________________________________\n");
            break;
      
         default:
           System.out.println("\nProducto no válido.\n");

            break;

       } } while (opcion !=0);

         System.out.println("\n------------------------------------------------------\n");

         System.out.println("Listado de productos:\n");

         for (Producto producto1 : productos){

         System.out.println(producto1);

         System.out.println("\n------------------------------------------------------\n");
      }

      System.out.println("\n______________________________________________________\n");
         System.out.println("Cantidad de productos: " + productos.size());
         System.out.println("\n______________________________________________________\n");

      }

      
   
      //------------------------------------------------------------------------------------------
      //                                  PRODUCTOS - Método
      //------------------------------------------------------------------------------------------



   public static void pedirDatosAnimal (Scanner sc, List<Animal> animales, int opcion)
      
      {
          System.out.println("\n------------------------------------------------------\n");
          System.out.print("\nPor favor ingrese la identificación del animal:\n");
            int codigo = sc.nextInt();
          System.out.println("\n------------------------------------------------------\n");

            System.out.print("\nPor favor ingrese la raza del animal:\n");
            sc.nextLine();
            String raza = sc.nextLine();
          System.out.println("\n------------------------------------------------------\n");
            
            System.out.print("\nPor favor digite el peso del animal:\n");
            int peso = sc.nextInt();
          System.out.println("\n------------------------------------------------------\n");

          System.out.print("\nPor favor digite el nombre del animal:\n");
            sc.nextLine();
            String nombre = sc.nextLine();
          System.out.println("\n------------------------------------------------------\n");

          System.out.println("\nPor favor ingrese la edad del animal:\n");
            int edad = sc.nextInt();

          System.out.println("\n------------------------------------------------------\n");

          System.out.println("\nPor favor ingrese el precio base del animal:\n");
            int precio = sc.nextInt();

          if (opcion == 1) { 

            Animal vacamu = new Vaca(codigo, raza);
            vacamu.setEdad(edad);
            vacamu.setID(codigo);
            vacamu.setPrecio(precio);
            vacamu.setRaza(raza);
            vacamu.setNombre(nombre);
            vacamu.setPeso(peso);
         } 
         
         if (opcion == 2) { 
         
           Animal gallinapio = new Gallina(codigo, raza);

            gallinapio.setEdad(edad);
            gallinapio.setID(codigo);
            gallinapio.setPrecio(precio);
            gallinapio.setRaza(raza);
            gallinapio.setNombre(nombre);
            gallinapio.setPeso(peso);

         
         }

      }

      //------------------------------------------------------------------------------------------
      //                                         ANIMALES
      //------------------------------------------------------------------------------------------

      public static void agregarAnimal (Scanner sc, List<Animal> animales) {
         
         
      int opcion=0;

       
      do {

      System.out.println("""
             ------------------------------------------------------
            
             Elija el tipo de animal que desea agregar:

            1. Gallinas.
            2. Vacas.
            0. Salir.

             ------------------------------------------------------
            """);

      System.out.println("Opción:");
      opcion = sc.nextInt();

      switch (opcion) {

         case 1:
         
         pedirDatosAnimal(sc, animales, 1);

            break;
      
         case 2:
   
         pedirDatosAnimal(sc, animales, 2);
         
            break;

         case 3:

            System.out.println("""
                 Sonic: Gotta go fast buddy!
                  """);
            break;

         case 0:
            System.out.println("\n______________________________________________________\n");
            System.out.println("""
                  Bye byeeee!!! :D
            """);
            System.out.println("\n______________________________________________________\n");
            break;
      
         default:
           System.out.println("\nProducto no válido.\n");

            break;

       } } while (opcion !=0);

         System.out.println("\n------------------------------------------------------\n");

         System.out.println("Listado de productos:\n");

         for (Animal animal: animales)
         {System.out.println(animal);}

         System.out.println("\n------------------------------------------------------\n");


         System.out.println("\n______________________________________________________\n");

         System.out.println("Cantidad de productos: " + animales.size());

         System.out.println("\n______________________________________________________\n");

      }


      }

      
      
   
