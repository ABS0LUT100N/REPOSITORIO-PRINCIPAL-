package basico;



public class Ejemplo2 {

    public static void main(String[] args) {

    try {

         int [] numeros = {1,2,3,4};

        System.out.println(numeros[4]);

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("No hay un cuarto lugar en el índice.");
    }
       
      finally {
            System.out.println("Bloque Finally siempre se ejecuta.");
        }

        System.out.println("Después de manejar la excepción.");
    }
    
}
