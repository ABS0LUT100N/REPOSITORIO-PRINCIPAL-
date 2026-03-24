public class LibrosDeTexto extends Libro{
    

    private int curso; 

  public  LibrosDeTexto(String titulo, String autor, int curso){
            super(titulo, autor);
            this.curso = curso;
  }

  @Override
  public void Imprimir()
     {  super.Imprimir();
        System.out.println("curso: " + curso);}

  public int getCurso() {
    return curso;
  }

  public void setCurso(int curso) {
    this.curso = curso;
  }

    

}
