package personas;

import java.time.LocalDate;
import java.time.Period;

 public class Empleado extends Persona {
    
   private int añosAntiguedad;
   private LocalDate fechaIngreso;
   LocalDate fechaActual = LocalDate.now();
   private Cargo cargo;


   public Empleado(int ID, String email, int añosAntiguedad, String fechaIngreso, Cargo cargo) {
    super(ID, email);
    this.añosAntiguedad = añosAntiguedad;
    this.fechaIngreso = LocalDate.parse(fechaIngreso);
    this.cargo = cargo;
  }

  @Override

  public  void imprimir(){
    super.imprimir();
    System.out.println("Cargo: " + cargo);
    System.out.println("Años de antiguedad: " + calcularAñosAntiguedad());
  }

  private int calcularAñosAntiguedad() {

    añosAntiguedad = Period.between(fechaIngreso, fechaActual).getYears();

    return añosAntiguedad;

  }

  public int getAñosAntiguedad() {
    return añosAntiguedad;
  }

  public LocalDate getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(LocalDate fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  //Metodo statics


  

}
