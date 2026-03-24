public class Sonic {
    
    private String nombre;
    private String raza;
    private String frase;
    private String mock;
    private int edad;
    private int fuerza;
    private int velocidad;
    private int aceleracion;
    private String color;

    //Constructores

    public Sonic (String nombre , String raza, int edad , int fuerza , int velocidad , int aceleracion , String color , String frase)
    
    {   this.nombre = nombre;
        this.raza = raza;
        this.frase = frase;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.aceleracion = aceleracion;
        this.color = color;
        this.mock = "Hey! Not my problem, i'm just a hedgehog who loves speed!!!";
    }

    //Metodos

    public void spindash()   {    System.out.println("Take it! Ha!"); }
    public void running()    {    System.out.println("Sonic's the name, speed's my game!"); }
    public void decirFrase() {    System.out.println(frase); }

    //Setters

    public void setNombre (String nombre)        {this.nombre = nombre;} 
    public void setRaza (String raza)            {this.raza = raza;}
    public void setFrase (String frase)          {this.frase = frase;}
    public void setVelocidad (int velocidad)     {this.velocidad = velocidad;}
    public void setFuerza (int fuerza)           {this.fuerza = fuerza ;}
    public void setAceleracion (int aceleracion) {this.aceleracion = aceleracion;}
    public void setColor (String color)          {this.color = color;}
    public void setMock (String mock)            {this.mock = mock;}

    //Getters

    public String getNombre()                    {return nombre;}
    public String getRaza()                      {return raza;}
    public String getFrase()                     {return frase;}
    public int getVelocidad()                    {return velocidad;}
    public int getFuerza()                       {return fuerza;}
    public int getAceleracion()                  {return aceleracion;}
    public String getColor()                     {return color;}
    public String getMock()                      {return mock;}

    //ShowInfo

    public void showInfo()

    {  
        System.out.println("\n ---------------------------- \n");
        System.out.println  ("Nombre: " + nombre);
        System.out.println  ("Raza: " + raza);
        System.out.println  ("Color: " + color);
        System.out.println  ( "Velocidad: " + velocidad);
        System.out.println  ( "Fuerza: " + fuerza);
        System.out.println  ( "Frase: " + frase);
        System.out.println("\n ---------------------------- \n");
    }

    public void strength ()
    
    {
        if (fuerza > 1000) {System.out.println ("- 'Woa, a sturdy one!' \n");}

    }

}
