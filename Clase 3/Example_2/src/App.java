import animales.Cat;
import animales.Chicken;
import animales.Dog;

public class App {
    public static void main(String[] args) {
        
        Dog dog = new Dog ("Doggie", "Pastor Alemán");
        dog.print();
        dog.bark();
        dog.run();

       Chicken chicken = new Chicken("A", "Gallina",99);
       chicken.print();

       Cat cat = new Cat("Tom" , "Siamés");
       cat.print();
       cat.meow();

       Cat cat2 = new Cat("Mimi");
       cat2.print();
       cat2.meow();


    }


}
