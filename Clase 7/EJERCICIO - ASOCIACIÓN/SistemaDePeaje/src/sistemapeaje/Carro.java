    package sistemapeaje;

    public class Carro extends Vehiculo {
    
         public static int valorPeaje = 10000;

    public Carro (String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    static void setValorPeaje(int valorPeaje) {
        valorPeaje = valorPeaje;
    }

    public void imprimir() {

        System.out.println("Placa del vehículo: " + placa);
        System.out.println("Valor del peaje: $" + valorPeaje);

    }
    
    }
