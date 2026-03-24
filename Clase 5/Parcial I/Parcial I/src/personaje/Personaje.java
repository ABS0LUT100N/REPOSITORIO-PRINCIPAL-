    package personaje;
    
    public class Personaje {
    
    private String nombre;
    private int puntosVida;
    private int nivel;

    public Personaje(String nombre, int puntosVida) {

    this.nombre = nombre;
    this.nivel = nivel;
    this.puntosVida = puntosVida;

    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre + "\nPuntos de vida: " + puntosVida + "\nNivel: " + nivel);
    }

    public void atacar(){
        System.out.println("Ataque!!!");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getNivel() {
        return nivel;
    }

    

}
