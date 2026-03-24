public class Novela extends Libro{

    private TiposNovela tiposNovela;

    public Novela(String título, String autor){super(título, autor);}

    @Override
    public void Imprimir(){ super.Imprimir();
        System.out.println( "Tipo de novela: " + tiposNovela );  System.out.println("\n ----------------------------- \n"); }

    public TiposNovela getTiposNovela() {
        return tiposNovela;
    }

    public void setTiposNovela(TiposNovela tiposNovela) {
        this.tiposNovela = tiposNovela;
    }

  
}
