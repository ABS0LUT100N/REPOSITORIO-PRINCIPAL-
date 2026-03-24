    
    import java.util.ArrayList;
    import java.util.List;

    public class Orden {

        //------------------------------------------------------------------------------------------
        //                                         ATRIBUTOS
        //------------------------------------------------------------------------------------------


        private int identificador;
        private List<LineaPedido> itemsPedido;

        
        //------------------------------------------------------------------------------------------
        //                                         CONSTRUCTOR
        //------------------------------------------------------------------------------------------


    public Orden(int identificador) {

        this.identificador = identificador;
        this.itemsPedido = new ArrayList<>();

    }

        //------------------------------------------------------------------------------------------
        //                                         GETTERS Y SETTERS
        //------------------------------------------------------------------------------------------


    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    
        //------------------------------------------------------------------------------------------
        //                                         MÉTODOS
        //------------------------------------------------------------------------------------------


    public void añadirItem (int identificador, int cantidad, Producto producto) {

       LineaPedido detalle = new LineaPedido(identificador, cantidad, producto);
       itemsPedido.add(detalle);

    }

    public int calcularTotalOrden() {


        int total = 0;
         
        for(LineaPedido detalle : itemsPedido) {


            total += detalle.calcularSubtotalLineaPedido();
        }


        return total;

    }


    public void imprimir() {

        System.out.println("\n_______________________  ORDEN  _______________________\n ");

        System.out.println("Facturación del cliente:");
        System.out.println("Número de órden: #" + identificador);
        System.out.println("Cantidad de productos: " + itemsPedido.size());
        
        for (LineaPedido detalle:itemsPedido) {

            detalle.imprimir();
            
        }

  
    }

    }
