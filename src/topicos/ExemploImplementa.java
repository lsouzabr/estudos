package topicos;

public class ExemploImplementa implements ExemploInterface{
 
    private final ExemploInterface exemploInterface;

    public ExemploImplementa (ExemploImplementa exemploImplementa){
        this.exemploInterface = exemploInterface;
    }

    @Override
    public void teste() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'teste'");
    }
}