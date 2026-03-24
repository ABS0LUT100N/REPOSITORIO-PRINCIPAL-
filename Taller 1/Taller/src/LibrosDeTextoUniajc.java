public class LibrosDeTextoUniajc extends LibrosDeTexto {
    
    private String facultad;

    public LibrosDeTextoUniajc(String título, String autor, int curso, String Facultad){
        super(título, autor, curso);
    
        this.facultad = facultad;

    }

    @Override
    public void Imprimir(){
          super.Imprimir(); 
          System.out.println("Facultad: " + facultad);}

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
