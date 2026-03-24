import java.time.LocalDate;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        
        int ageStudent = 20;
        String name = "Juan";
        double weight = 23.5;
        //Date

        LocalDate defaultDate = LocalDate.parse("2023-04-23");
         

        LocalDate today = LocalDate.now();

        Period period = Period.between(defaultDate, today);

        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();

        System.out.println("""
                ----    Datos del estudiante    ----
                """);
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + ageStudent);
        System.out.println("Peso: " + weight);
        System.out.println("Fecha: " + day + "/"+ month + "/"+ year);
        System.out.println("Tiempo contratado: " + period.getYears() + " años");

    }
}
