public class app {
    
public static void main(String[] args) {
    
    LibrosDeTextoUniajc LibroUniajc = new LibrosDeTextoUniajc("Introducción al Cálculo", "Isaac Newton", 3303, "Facultad de Ingeniería");
    LibroUniajc.setPropietario("Natalia Erazo Lozano");
    LibroUniajc.setPrecio(100.984);
    LibroUniajc.Imprimir();

    Novela LibroNovela = new Novela("The Little Prince", "Antonie de Saint-Exupéry");
    LibroNovela.setPropietario("Santiago Camino Muñoz");
    LibroNovela.setPrecio(110.634);
    LibroNovela.setTiposNovela(TiposNovela.Ciencia_Ficción);
    LibroNovela.Imprimir();
}

}
