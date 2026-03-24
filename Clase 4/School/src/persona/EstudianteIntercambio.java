package persona;

public class EstudianteIntercambio extends Estudiante{

    private Nacionalidad nacionalidad;

    public EstudianteIntercambio(String nombre, String email, String programa) {
        super(nombre, email, programa);

    }

    public Nacionalidad getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public void Imprimir()
    {super.Imprimir(); System.out.println("Nacionalidad: " + nacionalidad);
                       System.out.println("\n --------------------------------- \n");}


}
