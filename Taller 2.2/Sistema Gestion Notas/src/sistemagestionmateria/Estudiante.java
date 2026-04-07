    package sistemagestionmateria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante extends Persona{

    private String curso;
    private List<Materia> materias;
    Scanner sc=new Scanner(System.in);

    public Estudiante(String nombre, int edad, String genero, int identificacion, String curso) {
            super(nombre, edad, genero, identificacion);

            this.curso = curso;
        this.materias=new ArrayList<>();
        }

    @Override
    public void imprimir(){
        super.imprimir();

    }
    public void agregarMateria (){
     int opcion;
        do {
            System.out.print("""
                    *******************************************
                    ¿Desea agregar una materia?

                    1.Si
                    0.No

                    -------------------------------------------
                    Seleccione una opcion:""");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                 System.out.println("\nIngrese la materia:");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    
                    System.out.println("Ingrese Nota 1:");
                    double nota1 = sc.nextDouble();
                    System.out.println("Ingrese Nota 2:");
                    double nota2 = sc.nextDouble();
                    System.out.println("Ingrese Nota 3:");
                    double nota3 = sc.nextDouble();

        Materia materia = new Materia (nombre, nota1, nota2, nota3);
        materias.add(materia);
        materia.imprimir();
        break;

        default: System.out.println("Opcion invalida"); 

        break;   
        }
        }while(opcion != 0);
    }

    public double calcularPromedio(Materia materia){

         double notaFinal;

         notaFinal = (materia.getNota1()+materia.getNota2()+materia.getNota3())/3;

        return (notaFinal);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    

}
