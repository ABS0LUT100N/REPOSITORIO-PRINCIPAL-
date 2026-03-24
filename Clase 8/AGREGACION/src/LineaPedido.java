    
    
    public class LineaPedido {

        private int identificador;
        private int cantidad;
        public Producto producto;


        public LineaPedido(int identificador, int cantidad, Producto producto) {
            this.identificador = identificador;
            this.cantidad = cantidad;
            this.producto = producto;
        }


        public int getIdentificador() {
            return identificador;
        }


        public int getCantidad() {
            return cantidad;
        }

        public void getProducto() {

        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }


        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        private Producto setProducto(Producto producto) {
            return producto;

        }
   
        public void imprimir() {

            System.out.println("");
        }
    
    }
