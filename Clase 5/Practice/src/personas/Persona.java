package personas;

public class Persona{

    //atributos
    
    private String nombre;
    private int ID;
    private String email;
    private static int version = 1;
  
    //constuctores

    public Persona(int ID, String email){

        this.ID = ID;
        this.email = email;
        this.nombre = nombre;


    }
    public Persona() {}


    //metodos

    public void imprimir(){

        System.out.println("Nombre: " + nombre + "\nID: " + ID + "\nE-mail: " + email);
    }
    //ejemplo sobrecarga de métodos
    public int calcularSalario(int horas, int valorHora){

        int salario = horas * valorHora;

        return salario;
    }

    public int calcularSalario(int horas, int valorHora, int bonificacion){
    
        int salario = horas * valorHora + bonificacion;

        return salario;
    }

    //getters

    public String getNombre() {
        return nombre;
    }
    public int getID() {
        return ID;
    }
    public String getEmail() {
        return email;
    }
   

    //setters

 public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setID(int ID) {
        ID = ID;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static void version (){
        
        String mensaje = "hola";
        System.out.println(mensaje);
        System.out.println("version: " + version);
    }

}