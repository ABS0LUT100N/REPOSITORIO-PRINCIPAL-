import java.util.Scanner;

public class Condicionales {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
      

        System.out.println("""
                Este programa determina si una persona es mayor de edad!
                Elija una opción:

                1. Nombre y edad.
                2. Edad.


                """);

        int options = sc.nextInt();
        sc.nextLine();

        switch (options) {
            case 1:

                System.out.println("Por favor, digite su nombre: ");
                nombre = sc.nextLine();

                 System.out.println( "Por favor, digite su edad: ");
                edad = sc.nextInt();
                mayorEdad(edad, nombre);

                break;

            case 2:

                System.out.println( "Por favor, digite su edad: ");
                edad = sc.nextInt();
                mayorEdad(edad, "usuario");

                break;

            case 3:

                System.out.println("Poyo!!");
                break;

            default:

                System.out.println("Opción no válida.");

                break;
        }

        sc.close();

    }

    public static void mayorEdad (int edad, String nombre)
    
    { if (edad >= 18) { System.out.println ( nombre + " eres mayor de edad."); } else { System.out.println( nombre + " eres menor de edad");} }
}
