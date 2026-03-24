package persona;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
 
    private int semestre;
    private List<String> materias;
    private String programa;

    //Constructor
    public Estudiante(String nombre, String email, String programa) {
        super(nombre, email);

        this.semestre = semestre;
        this.materias = new ArrayList<>();
        this.programa = programa;

    
    }

    public int getSemestre() {
        return semestre;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public String getPrograma() {
        return programa;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setMaterias(String materias) {
        this.materias.add(materias);
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public void Imprimir() 
    { super.Imprimir(); System.out.println("\nPrograma: " + programa + "\nSemestre: " + semestre + "\nMaterias: ");
        
    
        if (materias.isEmpty()) 
                      { System.out.println("No tienes materias en matrícula");} else {
        for (String materia:materias)
                      { System.out.println(materia);}}}

}
