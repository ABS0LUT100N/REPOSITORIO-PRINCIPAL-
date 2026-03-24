    import personas.Cargo;
import personas.Empleado;
    import personas.Persona;
    
    public class App {
    public static void main(String[] args) {
      
        Persona persona1 = new Persona( 11111, "oraoraora@gimmeabreak.com");
       
        Persona persona2 = new Persona(22222, "mudamudamuda@ihaveadrem.com");
        
        System.out.println("-----------------------------------------------");
        persona1.imprimir();
       
        System.out.println("-----------------------------------------------");
         
        persona2.setNombre("Giorno Giovanna"); 
        persona2.imprimir();
        System.out.println("Salario: " + persona2.calcularSalario(6, 80000, 10000));
        
        System.out.println("-----------------------------------------------");

        Empleado empleado = new Empleado(11111, "gottagofast@sonicspeed.com", 3, "2022-03-23", Cargo.CEO);
        
        empleado.setNombre("Sonic the Hedgehog");
        empleado.imprimir();
       
        System.out.println("-----------------------------------------------");

        Persona.version();

        System.out.println("-----------------------------------------------");

    }
}
