package basico;



public class Lanzarexepciones {

    public static void main(String[] args) {
        try {
            setEdad(-5);
        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void setEdad(int edad) {

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        System.out.println("Edad registrada." + edad);
    }
}
