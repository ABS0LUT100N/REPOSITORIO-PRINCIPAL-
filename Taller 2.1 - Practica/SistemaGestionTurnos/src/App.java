
    import InterfacesGestion.*;
    import SistemaDeGestionTurnos.*;
    
    public class App {

    public static void main(String[] args)  {
     
    GestorTurnos gestorTurnos = new GestorTurnosMemoria();
    TurnosApp turnosApp = new TurnosApp(gestorTurnos);

    turnosApp.start();
    }
    
    }
