    package sistemapeaje;

    abstract public class Vehiculo {
    
        String placa;
        Vehiculo (String placa) {

            this.placa = placa;

        }
        public String getPlaca() {
            return placa;
        }
        public void setPlaca(String placa) {
            this.placa = placa;
        }

        
    }
