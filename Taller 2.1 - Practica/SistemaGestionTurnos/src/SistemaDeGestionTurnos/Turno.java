    package SistemaDeGestionTurnos;
    import java.time.LocalDate;

    public class Turno {

        private Cliente cliente;
        private Empleado empleado;
        private int id;
        private LocalDate fecha;
        
    
    public Turno(Cliente cliente, int id, LocalDate fecha) {
            this.cliente = cliente;
            this.id = id;
            this.fecha = fecha;
        }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Empleado getEmpleado() {
        return empleado;
    }


    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void imprimir() {

        System.out.println("************ TURNO ************");
        System.out.println("Turno: " + id);
        System.out.println("Empleado: " + empleado);
        System.out.println("cliente: " + cliente);    
        System.out.println("\n ---------------------------------- \n");

    }

    
    }
