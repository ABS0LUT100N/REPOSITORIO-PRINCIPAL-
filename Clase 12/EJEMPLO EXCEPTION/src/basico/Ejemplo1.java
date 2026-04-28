package basico;




public class Ejemplo1 {

    public static void main(String[] args) throws Exception {
        
        try {

        int resultado;
        resultado = 12/0;
        System.out.println(resultado);

        } catch ( ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }

         finally {
            System.out.println("Bloque Finally siempre se ejecuta.");
        }

        System.out.println("Después de manejar la excepción.");
    }
        
    }
    

