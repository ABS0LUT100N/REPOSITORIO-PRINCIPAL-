public class App {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Megumi Fushiguro", 1107848515);

        persona1.setAltura(175);
        persona1.setPeso(70.9);
        persona1.setFechaNacimiento("2002-12-22");   
        persona1.Imprimir();
        persona1.calcularEdad(); 
    }
}
