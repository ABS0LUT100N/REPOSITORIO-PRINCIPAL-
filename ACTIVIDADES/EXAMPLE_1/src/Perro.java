

public class Perro {
    
    //atributos
    private String Nombre;
    private String Raza;
    private int Edad;
    private int Tamaño;

    //constructor
    public Perro(String Nombre, String Raza){
        this.Nombre = Nombre;
        this.Raza = Raza;
    }

    //métodos
    public void ladrar(){
        System.out.println("Guau Guau");
    }

    public void correr(){
        System.out.println("Estoy corriendo");
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public void dormir(){
        System.out.println("Estoy durmiendo");

    }

    //métodos setters
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setRaza(String Raza){
        this.Raza = Raza;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public void setTamaño(int Tamaño){
        this.Tamaño = Tamaño;
    }


    //métodos getters
    public String getNombre(){
        return Nombre;
    }
    public String getRaza(){
        return Raza;
    }
    public int getEdad(){
        return Edad;
    }
    public int getTamaño(){
        return Tamaño;
    }

    //Información
    public void showInfo(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Raza: " + Raza);
        System.out.println("Edad: " + Edad);
        System.out.println("Tamaño: " + Tamaño);
    }
}
