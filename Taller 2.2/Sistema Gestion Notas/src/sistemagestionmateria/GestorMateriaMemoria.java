    package sistemagestionmateria;

    import java.util.ArrayList;
import java.util.List;

import Interfaces.GestorMateria;

    public class GestorMateriaMemoria implements GestorMateria{

        private List<Materia> materias;


    public GestorMateriaMemoria() {
            this.materias = new ArrayList<>();
        }


    public void agregarMateria (Docente docente, String nombre, int nota1, int nota2, int nota3){
    

    Materia materia = new Materia (nombre, nota1, nota2, nota3);
    materias.add(materia);
    materia.imprimir();

    }
    public void registrarMateria (Estudiante estudiante){


    }
    public void mostrarMateriasNotas(){}

    
}
