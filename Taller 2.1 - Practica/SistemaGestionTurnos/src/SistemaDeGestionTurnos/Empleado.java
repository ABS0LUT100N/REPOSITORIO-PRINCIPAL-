    package SistemaDeGestionTurnos;
    public class Empleado extends Persona {
    
        private String puesto;

        public Empleado(String nombre, int identificacion, int edad, String puesto) {
            super(nombre, identificacion, edad);
            this.puesto = puesto;

        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public void imprimir() {

            System.out.println("Puesto: " + puesto);
            super.imprimir();


        }


    }
