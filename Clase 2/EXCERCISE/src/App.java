import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {



        List<Persona> personas = new ArrayList<>();

        int sumEdades = 0;
        int promedio;

        Persona persona1 = new Persona("Jotaro" , "Kujo" , "1107848515" , 1970 );
        Persona persona2 = new Persona("Jolyne" , "Cujoh" , "2208959626" , 1992 );
        personas.add(persona1);
        personas.add(persona2);
        personas.add(new Persona ("Joseph" , "Joestar" , "318293240888" , 1920));
        personas.add(new Persona ("Josuke" , "Higashikata" , "11089494723" , 1983));

        for (Persona persona : personas){persona.showInfo() ; System.out.println("Edad: " + persona.calcularEdad());}
    
        for(Persona persona : personas) { sumEdades += persona.calcularEdad(); }
        promedio = sumEdades/personas.size();


        System.out.println("""
                
            __________________________________________
                """);
                
        System.out.println("Cantidad de personas: " + personas.size() +"\nPromedio de edad: " + promedio);
        
        System.out.println("""
            __________________________________________
                """);
    }}
        
        