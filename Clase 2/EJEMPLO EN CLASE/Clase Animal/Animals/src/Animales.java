public class Animales {
    
    private String raza;
    private String nombre;
    private String especie;

    //Constructor

    public Animales (String nombre, String raza, String especie)

    {
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;

    }

    //Setters

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //Getters

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    //Metodos

    public void imprimir()

    {   System.out.println("\n ═══════ ********* ═══════ \n");  

        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Especie: " + especie);

        System.out.println("\n ═══════ ********* ═══════ \n");  

    }

    




}
