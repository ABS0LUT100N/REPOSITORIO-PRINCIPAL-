package animales;

public class Chicken extends Animals {

    private int EggCountPerMonth;
    
     public Chicken (String name, String raza, int EggCountPerMonth) 
    { super(name);
      this.raza = raza;
      this.EggCountPerMonth = EggCountPerMonth;

     }

     @Override
     public void print(){super.print();
    System.out.println("Cantidad de huevos por mes: " + EggCountPerMonth);
    System.out.println("\n ___________________________ \n");}

}

