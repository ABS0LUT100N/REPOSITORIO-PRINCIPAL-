    
    
    public class LineaPedido {

          
        //------------------------------------------------------------------------------------------
        //                                         ATRIBUTOS
        //------------------------------------------------------------------------------------------


        private int identificador;
        private int cantidad;
        public Producto producto;

           
        //------------------------------------------------------------------------------------------
        //                                         CONSTRUCTOR
        //------------------------------------------------------------------------------------------

        public LineaPedido(int identificador, int cantidad, Producto producto) {
            this.identificador = identificador;
            this.cantidad = cantidad;
            this.producto = producto;
        }

        
        //------------------------------------------------------------------------------------------
        //                                         GETTERS Y SETTERS
        //------------------------------------------------------------------------------------------


        public int getIdentificador() {
            return identificador;
        }


        public int getCantidad() {
            return cantidad;
        }

        public Producto getProducto() {
            return producto;
        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }


        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public void setProducto(Producto producto) {
           this.producto = producto;

        }
   
        public void imprimir() {
            producto.imprimir();
        }

        public int calcularSubtotalLineaPedido() { 

            int subtotal = cantidad*producto.getPrecio();

            return subtotal;
        }
    
    }
