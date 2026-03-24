public class Erizo {
    

    private String Nombre;
    private String Color;
    private String Frase;
    private int Edad;

    //constructor
    public Erizo(String Nombre, String Color){
        this.Nombre = Nombre;
        this.Color = Color;
        this.Frase = "Gotta go fast!";
}

    //métodos
    public void pinchar(){
        System.out.println("You're too slow!");
    }

    public void correr(){
        System.out.println("Running at high speed!");
    }

    public void decirFrase(){
        System.out.println(Frase);
    }

    //métodos setters
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    public void setFrase(String Frase){
        this.Frase = Frase;
    }

    //métodos getters
    public String getNombre(){
        return Nombre;
    }
    public String getColor(){
        return Color;
    }
    public int getEdad(){
        return Edad;
    }
    public String getFrase(){
        return Frase;
    }

    //Información
    public void showInfo(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Color: " + Color);
        System.out.println("Edad: " + Edad);
        System.out.println("Frase: " + Frase);
    }

}