public class Joseph {
    
    private String Nombre;
    private int Edad;
    private String Frase;

    //constructor
    public Joseph(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Frase = "\n NIGERUNDAYOOOOOOOOO, SMOKEY!!!!!!!!!! \n";
}

    //métodos
    public void decirFrase(){
        System.out.println(Frase);
    }

    public static void JOESTAR() {
        
        System.out.println("\n YOUR NEXT LINE IS... \n");
    }

    //métodos setters
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
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
    public int getEdad(){
        return Edad;
    }
    public String getFrase(){
        return Frase;
    }

    //Información

    public void showInfo(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Frase: " + Frase);
    }

}