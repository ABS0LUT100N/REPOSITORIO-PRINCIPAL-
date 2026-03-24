    
    public class Producto {

    
        //------------------------------------------------------------------------------------------
        //                                         ATRIBUTOS
        //------------------------------------------------------------------------------------------


        private int identificador;
        private String nombre;
        private String descripcion;
        private int precio;

                
        //------------------------------------------------------------------------------------------
        //                                         CONSTRUCTOR
        //------------------------------------------------------------------------------------------

        
        public Producto(int identificador, String nombre, String descripcion, int precio) {
            this.identificador = identificador;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        //------------------------------------------------------------------------------------------
        //                                         GETTERS Y SETTERS
        //------------------------------------------------------------------------------------------

        public int getIdentificador() {
            return identificador;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getPrecio() {
            return precio;
        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        
    
        //------------------------------------------------------------------------------------------
        //                                         MÉTODOS
        //------------------------------------------------------------------------------------------


        public void imprimir () {

      System.out.println("\n----------------------- PRODUCTO -----------------------\n ");

        System.out.println("Identificador:" + identificador);
        System.out.println("Nombre del producto:" + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);

      System.out.println("\n--------------------------------------------------------\n ");
        
    
    }}
