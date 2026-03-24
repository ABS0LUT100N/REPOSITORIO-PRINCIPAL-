    package sistemapeaje;
    import java.util.*;

    public class Peaje {

        String nombre;
        String departamento;
        int totalPeaje;
        static int totalCamiones = 0;
        static int totalCarros = 0;

    public Peaje(String nombre, String departamento) {

        this.nombre = nombre;
        this.departamento = departamento;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getTotalPeaje() {
        return totalPeaje;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

    public static int getTotalCarros() {
        return totalCarros;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTotalPeaje(int totalPeaje) {
        this.totalPeaje = totalPeaje;
    }

    public static void setTotalCamiones(int totalCamiones) {
        Peaje.totalCamiones = totalCamiones;
    }

    public static void setTotalCarros(int totalCarros) {
        Peaje.totalCarros = totalCarros;
    }

    public int calcularPeaje (Vehiculo vehiculo) { 

        if (vehiculo instanceof Carro) {

            totalCarros ++;
            totalPeaje += Carro.valorPeaje;
            return Carro.valorPeaje;

        } else if(vehiculo instanceof Camion) {

            Camion camion = (Camion) vehiculo;
            totalPeaje += (camion.numerosEjes * camion.valorPeajeEje);
            return (camion.numerosEjes * camion.valorPeajeEje);

        } else return -1;
    }

    public void imprimir() {

    System.out.println("Nombre del local de peaje: " + getNombre());
    System.out.println("Ubicación del Peaje: " + getDepartamento());
    System.out.println("Número total de carros: " + totalCarros);
    System.out.println("Número total de camiones: " + totalCamiones);
   
    int totalVehículos = totalCarros + totalCamiones;
   
    System.out.println("Número total de vehículos: " + totalVehículos);
    System.out.println("Dinero total: $" + totalPeaje);
    
    
    }
    }
