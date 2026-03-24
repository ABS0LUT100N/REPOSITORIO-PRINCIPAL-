    package personaje;

    public class Guerrero extends Personaje{

        private ClaseGuerrero claseGuerrero;

        public Guerrero(String nombre, int puntosVida) {
            super(nombre, puntosVida);
        }

        @Override
        public void imprimir(){
            super.imprimir();
            System.out.println("Tipo de Guerrero: " + claseGuerrero);

        }

        public ClaseGuerrero getClaseGuerrero() {
            return claseGuerrero;
        }

        public void setClaseGuerrero(ClaseGuerrero claseGuerrero) {
            this.claseGuerrero = claseGuerrero;
        }

        
    
}
