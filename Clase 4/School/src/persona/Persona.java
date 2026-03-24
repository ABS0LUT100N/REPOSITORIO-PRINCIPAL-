package persona;

public class Persona {
    
    private String nombre;
    private int ID;
    private String email;

    //Constructor

    Persona(String nombre, String email)
    {this.nombre = nombre;
     this.email = email;
     this.ID = ID;        }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Imprimir() 
    { System.out.println("\n --------------------------------- \n");
      System.out.println("Nombre: " + nombre + "\nID: " + ID + "\nE-mail: " + email );}

}
