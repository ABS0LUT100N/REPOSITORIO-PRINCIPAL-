package animales;

    public class Dog extends Animals{

    //Constructor
    public Dog (String name, String raza) 
    { super(name); this.raza = raza; }

    public void bark() { System.out.println( " wof wof ") ;  System.out.println("\n ___________________________ \n");}
    @Override
    public void run() {System.out.println("Running like a dog") ;  System.out.println("\n ___________________________ \n");}

 }

