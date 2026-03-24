import personaje.ClaseGuerrero;
import personaje.Guerrero;
import personaje.Mago;
import personaje.MagoOscuro;

public class App {
    public static void main(String[] args) {
        
        Guerrero warrior1 = new Guerrero("Natalia Erazo Lozano", 100);
        warrior1.setClaseGuerrero(ClaseGuerrero.Espadachin);
        warrior1.setNivel(40);
        System.out.println("\n-----------------------------------\n");
        warrior1.imprimir();
        warrior1.atacar();
        System.out.println("\n-----------------------------------\n");

        Mago sorcerer1 = new Mago("Natalia Erazo Lozano", 100, 600);
        sorcerer1.setNivel(90);
        sorcerer1.imprimir();

        System.out.println("\n-----------------------------------");
        sorcerer1.lanzarHechizo();
        sorcerer1.actualizarEnergía();
        System.out.println("\n-----------------------------------\n");

        MagoOscuro sorcerer2 = new MagoOscuro("Natalia Erazo Lozano", 100, 2000);
        sorcerer2.setNivel(80);
        sorcerer2.imprimir();
        System.out.println("\n-----------------------------------\n");
        sorcerer2.lanzarMaldicion();
        sorcerer2.actualizarEnergía();
        System.out.println("\n-----------------------------------\n");
       
    }
}
