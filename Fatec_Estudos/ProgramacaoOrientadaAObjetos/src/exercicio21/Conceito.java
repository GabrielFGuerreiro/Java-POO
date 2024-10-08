package exercicio21;

public abstract class Conceito
{
    private String nome_condominio;
    private double despesa_condominio;

    protected String getNome() {return nome_condominio;}
    
    protected double calcula_condominio(double despesa_condominio)
    {
        this.despesa_condominio = despesa_condominio;
        return despesa_condominio;
    }
    
    public abstract void endereco_condominio();    
}
