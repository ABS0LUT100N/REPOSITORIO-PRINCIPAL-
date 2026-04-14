
package inventariogestion;

public class Movimiento{

    private Administrador adminn;
    private Producto producto;
    private String fecha;
    private String tipoMovimiento;

    public Movimiento(Producto producto, String fecha, String tipoMovimiento) {
        this.producto = producto;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    public Administrador getAdminn() {
        return adminn;
    }
    public void setAdminn(Administrador adminn) {
        this.adminn = adminn;
    }
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    

    public void imprimir (){

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Tipo de movimiento: " + tipoMovimiento);


}}