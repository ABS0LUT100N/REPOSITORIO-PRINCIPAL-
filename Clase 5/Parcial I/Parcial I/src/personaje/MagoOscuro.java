    package personaje;

    public class MagoOscuro extends Mago {

        public MagoOscuro(String nombre, int puntosVida, int energia) {
            super(nombre, puntosVida, energia);
        }
    
        public void lanzarMaldicion(){

            if (energia > 1000) { System.out.println("Curse!!!"); setEnergia(energia-700); System.out.println("Ahora tengo... " + energia + " necesito recargar.");
            } else {System.out.println("Oh no!! No tengo energía!");}

        }

        @Override
        public void actualizarEnergía(){
            super.actualizarEnergía();
        }

        public void imprimir(){
            super.imprimir();

        }
    
}
