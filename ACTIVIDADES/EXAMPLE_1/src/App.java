
public class App {
         public static void main(String[] args) throws Exception {
         
        
        Perro perro1 = new Perro("Doggy", "Labrador");
        
        System.out.println("\n --- PERRO 1 --- \n");

            System.out.println("El nombre de mi perro es: " + perro1.getNombre());
            System.out.println("La raza de mi perro es: " + perro1.getRaza());
            System.out.println("La edad de mi perro es: " + perro1.getEdad());
            System.out.println("El tamaño de mi perro es: " + perro1.getTamaño());

        perro1.ladrar();
        perro1.correr();
        perro1.comer();
        perro1.dormir();

        Perro perro2 = new Perro("Bones", "Bulldog");

        System.out.println("\n --- PERRO 2 --- \n");
        
            System.out.println("El nombre de mi perro es: " + perro2.getNombre());
            System.out.println("La raza de mi perro es: " + perro2.getRaza());
            System.out.println("La edad de mi perro es: " + perro2.getEdad());
            System.out.println("El tamaño de mi perro es: " + perro2.getTamaño());

            perro2.ladrar();
            perro2.correr();
            perro2.comer();
            perro2.dormir();

        Erizo erizo1 = new Erizo("Sonic", "Azul");

        System.out.println("\n --- SONIC THE HEDGEHOG --- \n");
        
            System.out.println("El nombre de mi erizo es: " + erizo1.getNombre());
            System.out.println("El color de mi erizo es: " + erizo1.getColor());
            System.out.println("La edad de mi erizo es: " + erizo1.getEdad());
            erizo1.pinchar();
            erizo1.correr();
            erizo1.decirFrase();

        Joseph joseph1 = new Joseph("Joseph Joestar", 19);
        
        System.out.println("\n --- JOSEPH JOESTAR --- \n");
        
            System.out.println("El nombre de mi personaje es: " + joseph1.getNombre());
            System.out.println("La edad de mi personaje es: " + joseph1.getEdad());
            joseph1.decirFrase();
            Joseph.JOESTAR();
            joseph1.showInfo();
        }
    
        
    }


