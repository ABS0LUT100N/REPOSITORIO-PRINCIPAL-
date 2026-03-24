package animales;

public class Animals {
    private String name;
    protected String raza;


    public Animals(String name) {
        this.name = name;
    }


    public void run ()  { System.out.println("Running like any other animal.");}



    public void print () 
    { System.out.println("\n ___________________________ \n");
      System.out.println("Nombre: " + name ); 
      System.out.println("Raza: " + raza); }

    public String getName()          {return name;}
    public String getRaza()          {return raza;}
    public void setRaza(String raza) {this.raza = raza;}
    public void setName(String name) {this.name = name;}
    



}