package projeto;
/*
    padrao flyweigth e facade juntos

*/
public abstract class ComputadorFlyweigth{
    int id;
    String marca;
    protected Monitor m;
    protected gabinete g;
    protected Fonte f;
    ContextoEstadoComputador c;
    public abstract void ligar();
    public abstract void encerrar();
    
}