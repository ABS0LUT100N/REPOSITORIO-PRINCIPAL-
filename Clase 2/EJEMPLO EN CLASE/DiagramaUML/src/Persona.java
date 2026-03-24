
import java.time.LocalDate;
import java.time.Period;

    public class Persona {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private int ID;
    private LocalDate fechaNacimiento;

    //Construtor

    public Persona (String nombre, int ID)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.ID = ID;
        this.fechaNacimiento = fechaNacimiento;

    }

    //Metodos

    public void calcularEdad() 
    
    {

        if ( fechaNacimiento == null ) 
        
        {   System.out.println("La fecha de nacimiento no ha sido asignada"); 
            System.out.println("\n --------------------------------------- \n");   }
        
        
        else { LocalDate fechaActual = LocalDate.now();
               edad = Period.between( fechaNacimiento , fechaActual).getYears();
               System.out.println("Edad de la persona: " + edad + " años");
               System.out.println("\n --------------------------------------- \n");                                             }

    }


    //Setters

    public void setNombre (String nombre)                      { this.nombre = nombre ;  }
    public void setEdad (int edad)                             { this.edad = edad ;  }
    public void setPeso (double peso)                          { this.peso = peso ; }
    public void setAltura ( double altura)                     { this.altura = altura ; }
    public void setID (int ID)                                 { this.ID = ID ; }

    //Se debe colocar la fecha en el formato "YYYY/MM/DD"
    public void setFechaNacimiento (String fecha) { this.fechaNacimiento = LocalDate.parse(fecha) ; }

    //Getters

    public String getNombre()               {return nombre;}
    public int getEdad()                    {return edad;}
    public double getPeso()                 {return peso;}
    public double getAltura()               {return altura;}
    public int getID()                      {return ID;}
    public LocalDate getFechaNacimiento()   {return fechaNacimiento;}

    //Imprimir

    public void Imprimir()
    
        {
            System.out.println("\n --------------------------------------- \n");

            System.out.println("Nombre de la persona: " + nombre);
            System.out.println("Peso de la persona: " + peso + " kg") ;
            System.out.println("Altura de la persona: " + altura + " cm");
            System.out.println("ID de la persona: " + ID);
            System.out.println("Fecha de nacimiento de la persona: " + fechaNacimiento);

        }
    




    
}
