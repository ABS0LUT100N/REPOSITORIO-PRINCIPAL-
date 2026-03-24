import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

    List<Sonic> hedgehog = new ArrayList<>();

    Sonic hedgehog1 = new Sonic("Sonic" , "Erizo" , 15 , 1000 , 9000 , 4000 , "blue" , "Gotta go fast!");
    Sonic hedgehog2 = new Sonic("Shadow" , "Alien-like (hedgehog)" , 50 , 2000 , 8900 , 3000 , "Negro con líneas rojas" , "Tch...");
    hedgehog.add    (hedgehog1);
    hedgehog.add    (hedgehog2);
    hedgehog.add    (new Sonic ( "Silver" , "Erizo" , 14 , 900 , 7000 , 1000 , "Plateado" , "It's no use!!!"));
    hedgehog.add    (new Sonic ("Amy Rose" , "Erizo" , 12 , 3500 , 5000 , 100 , "Rosa" , "Have no fear, Amy Rose is here!"));
    hedgehog.add    (new Sonic ("Miles Prower" ,  "Zorro" , 8 , 500 , 7700 , 2000, "Anaranjado con blanco" , "Just believe on yourself!"));

    for (Sonic hedgehogs : hedgehog) {hedgehogs.showInfo(); hedgehogs.strength();}

    System.out.println("""
                
            __________________________________________
                """);
                
        System.out.println("Cantidad de mobians: " + hedgehog.size());
        
        System.out.println("""
            __________________________________________
                """);

    }
}
