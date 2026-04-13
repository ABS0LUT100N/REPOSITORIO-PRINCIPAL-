    package SistemaDeGestionTurnos;

    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Queue;
    import InterfacesGestion.GestorTurnos;

    public class GestorTurnosMemoria implements GestorTurnos {

        private Queue<Turno> colaTurnos;
        private List<Turno> turnosAtendidos;
        private int idTurno = 1;
        
        public GestorTurnosMemoria() {

            this.colaTurnos = new LinkedList<>();
            this.turnosAtendidos = new ArrayList<>();
        }

    
    public void agregarTurno(Cliente cliente, LocalDate fecha){

        Turno turno = new Turno(cliente, idTurno, fecha);

        colaTurnos.add(turno);
        turno.imprimir();
        idTurno ++;

    }

    public void atenderTurno(Empleado empleado){

        if (colaTurnos.isEmpty()){

            System.out.println("\n -- No se pueden asignar empleados. --\n");
        }
        else {

            Turno turno = colaTurnos.poll();
            turno.setEmpleado(empleado);
            turnosAtendidos.add(turno);

            System.out.println("\n ********** TURNO ATENDIDO :D !!! ********** \n");
            turno.imprimir();

        }

    }
    
    public void mostrarTurnosPendientes(){

        if (colaTurnos.isEmpty()) {

            System.out.println("\n -- No hay turnos pendientes... --\n");
       
        }
        else {

            for (Turno turno : colaTurnos) {

                turno.imprimir();
                
            }

        }

    }
    
    public void mostrarTurnosAtendidos(){

         if (colaTurnos.isEmpty()) {

            System.out.println("\n -- No hay turnos por atender... --\n");
       
        }
        else {

            for (Turno turno : turnosAtendidos) {

                turno.imprimir();
                
            }

        }

    }
    
    
    }
