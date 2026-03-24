    package personaje;

    public class Mago extends Personaje {

        protected int energia;

        public Mago (String nombre, int puntosVida, int energia) {
            super(nombre,puntosVida);

            this.energia = energia;

        }

        @Override
        public void imprimir(){
            super.imprimir();
            System.out.println("Energia: "+ energia);
        }


        public void lanzarHechizo(){

            if (energia > 500) { System.out.println("\nSpell!!! "); setEnergia(energia-300);; System.out.println("Mi energia actual es... " + energia + " Debo recuperarme."); }
            else {System.out.println("Ugh, no tengo suficiente energía...");}

            
        }

        public void actualizarEnergía(){

            if (energia <= 0 || energia >= 0 ) { setEnergia(energia + 10); System.out.println("\nRecharge!!! \nEnergía: " + energia);
        
            } else { getEnergia(); }

        }

        public int getEnergia() {
            return energia;
        }

        public void setEnergia(int energia) {
            this.energia = energia;
        }

        

     
    
    
}
