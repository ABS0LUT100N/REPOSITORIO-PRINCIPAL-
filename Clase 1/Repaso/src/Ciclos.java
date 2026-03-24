import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        mostrarMenu(sc);
}

    public static void mostrarMenu (Scanner sc){

        int option = 6;
        while (option != 4) {
            
                System.out.println("""
                Elija una opción:

                1. FOR
                2. WHILE
                3. DO,WHILE
                4. FOREACH
                5. SALIR

                """);

                option = sc.nextInt();
                switch (option) {
                    
                    case 1:
                        
                    CountTen();

                        break;

                    case 2:
                        
                    GuessNumber(sc);
                    
                        break;

                    case 3:
                        
                    Valid(sc);
                    
                        break;

                    case 4:
                        
                    printArrayList();
                    
                        break;

                    case 5:
                        
                        System.out.println("Adios!!");
                    
                        break;
                
                    default:

                    System.out.println("opcion no válida.");

                        break;
                }

        }
        
         sc.close();
    }

   

    public static void CountTen() {

        for ( int i = 1; i<=11 ; i++ ) {

            System.out.println(i);

        }
        
    }

    public static void GuessNumber (Scanner sc){

        int number = -1;
        int find = 5;

        while (number != find ) {
            System.out.println("Digite un número: ");
            number = sc.nextInt();
        }

        System.out.println("Ganaste!!!");
    }

    public static void Valid (Scanner sc){

        int number = -1;

        do{
        System.out.println("Digite un numero entre 1 y 10");
        number = sc.nextInt();
        } while (number < 1 || number > 10);
    }

    public static void printArrayList(){

        List <String> fruits = new ArrayList<>();

        fruits.add("Pera");
        fruits.add("Manzana");
        fruits.add("Piña");

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
