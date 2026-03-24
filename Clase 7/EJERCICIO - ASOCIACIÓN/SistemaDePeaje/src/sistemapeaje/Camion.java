    package sistemapeaje;

    public class Camion extends Vehiculo {

        public static int valorPeajeEje = 5000;
        public int numerosEjes;

    public Camion(String placa, int numerosEjes) {
       
        super(placa);
        this.numerosEjes = numerosEjes;

    }
    
    public int getValorPeaje() {
        return valorPeajeEje;
    }

    static void setValorPeaje(int valorPeajeEje) {

       valorPeajeEje = valorPeajeEje;

    }

    public static int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }

    public int getNumerosEjes() {
        return numerosEjes;
    }

    public void setNumerosEjes(int numerosEjes) {
        this.numerosEjes = numerosEjes;
    }

    public void imprimir() {

        System.out.println("Placa del camión: " + placa);
        System.out.println("Número de ejes: " + numerosEjes);
        System.out.println("Valor del peaje: $" + valorPeajeEje);
    }

    }
