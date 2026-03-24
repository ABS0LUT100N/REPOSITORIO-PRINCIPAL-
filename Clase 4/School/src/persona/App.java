package persona;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
     
        List<Persona> personas = new ArrayList<>();

        Persona Student = new Estudiante("Higashikata Josuke", "doradora@0verdrive.com.co", "Diseño");
        Estudiante Estudia = (Estudiante) Student;
        Estudia.setID(1107848515);
        Estudia.setSemestre(4);
        Estudia.setMaterias("- Dibujo técnico");
        Estudia.setMaterias("- Diseño Modelado");
        Estudia.setMaterias("- Interfaz web");
        
        Persona Teacher = new Profesor("Joseph Joestar","ohmygood@nigerundayosmokeyy.com.co");
        Profesor Teaching = (Profesor) Teacher;
        Teaching.setProfesion("Docente y Pioloto");
        Teaching.setID(220874664);

        Persona Studentt = new EstudianteIntercambio("Giorno Giovanna", "ihaveadream@mudamuda.com.co", "Ingeniería Ambiental");
        EstudianteIntercambio Exchange = (EstudianteIntercambio) Studentt;
        Exchange.setNacionalidad(Nacionalidad.Italiano);
        Exchange.setMaterias("- Química III");
        Exchange.setMaterias("- Economía I");
        Exchange.setMaterias("- Física IV");
        Exchange.setSemestre(4);
        Exchange.setID(304985473);


        personas.add(Student);
        personas.add(Teacher);
        personas.add(Studentt);

        Exchange.Imprimir();
        Teacher.Imprimir();
        Estudia.Imprimir();
        System.out.println("\n --------------------------------- \n");

       

    }}

