package persona;

public class Profesor extends Persona {

    private String profesion;

    public Profesor(String nombre, String email) {
        super(nombre, email);

        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public void Imprimir() {super.Imprimir(); System.out.println("Profesión: " + profesion);}
    
}
