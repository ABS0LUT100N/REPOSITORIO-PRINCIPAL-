    import java.util.ArrayList;
import java.util.List;

    public class Orden {

        private int identificador;
        private List<LineaPedido> itemsPedido;

    public Orden(int identificador) {

        this.identificador = identificador;
        this.itemsPedido = new ArrayList<>();

    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int calcularTotalOrden() {





        return 0;

    }


    public void imprimir() {

        System.out.println("\n---------------------------\n");
        System.out.println("Facturación del cliente:");
        System.out.println("\n---------------------------\n");

    }

    public void añadirItem (int identificador, int cantidad, Producto producto) {


    }
    }
