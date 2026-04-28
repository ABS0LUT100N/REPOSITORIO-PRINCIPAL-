package basico;



public class Soluciones123 {

    public static void main(String[] args) {

        try {

            String cadena = "e";
            int valor = Integer.parseInt(cadena);
            System.out.println("Valor: " + valor);

            int[] numeros = { 1, 2, 3, 4 };

            System.out.println("Número en el índice 4: " + numeros[4]);

            int resultado = 12 / 0;
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No hay un cuarto lugar en el índice.");
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir la cadena a número.");
        }

        finally {
            System.out.println("Bloque Finally siempre se ejecuta.");
        }

        System.out.println("Después de manejar la excepción.");

    }
}
