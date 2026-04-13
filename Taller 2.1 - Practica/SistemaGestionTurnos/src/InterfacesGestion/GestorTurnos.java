package InterfacesGestion;

import java.time.LocalDate;

import SistemaDeGestionTurnos.Cliente;
import SistemaDeGestionTurnos.Empleado;

    public interface GestorTurnos {

    public void agregarTurno(Cliente cliente, LocalDate fecha);
    public void atenderTurno(Empleado empleado);
    public void mostrarTurnosPendientes();
    public void mostrarTurnosAtendidos();
}


