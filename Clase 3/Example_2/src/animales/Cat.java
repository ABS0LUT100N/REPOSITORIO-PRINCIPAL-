package animales;

    public class Cat extends Animals {

    //Constructor  
    public Cat (String name, String raza) 
    { super(name); this.raza = raza;  }

    public Cat (String name) { super(name);}

    public void meow() { System.out.println("Meow meow") ; System.out.println("\n ___________________________ \n"); }
}

