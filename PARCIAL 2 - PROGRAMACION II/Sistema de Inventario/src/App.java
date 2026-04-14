
import interfazgestion.*;
import inventariogestion.*;

public class App {
    public static void main(String[] args) {

        GestorInventario gestorInventario = new GestorInventarioImplementacion();
        GestorInventarioApp gestApp = new GestorInventarioApp(gestorInventario);

        gestApp.start();
    }
}
