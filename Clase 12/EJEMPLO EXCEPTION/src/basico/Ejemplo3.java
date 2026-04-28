package basico;




public class Ejemplo3 {
    public static void main(String[] args) {

        int valor = 0;
        String cadena = "e";

        try {

            valor = Integer.parseInt(cadena);
            System.out.println(valor);

        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir la cadena a número.");
        }

        finally {
            System.out.println("Bloque Finally siempre se ejecuta.");
        }

        System.out.println("Después de manejar la excepción.");

    }
}
