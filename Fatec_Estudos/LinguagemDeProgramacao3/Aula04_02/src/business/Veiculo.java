package business;

abstract public class Veiculo
{
    private String modelo, fabricante;
    private int ano;
    protected int velocidadeAtual;
    
    public Veiculo(String modelo, String fabricante, int ano)
    {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        velocidadeAtual = 0;
    }

    public int getVelocidadeAtual() {return velocidadeAtual;}

    public void acelerar()
    {
        velocidadeAtual += 5;
        if(velocidadeAtual > 180) this.velocidadeAtual = 180;
    }

    public void desacelerar()
    {
        velocidadeAtual -= 5;
        if(velocidadeAtual < 0) this.velocidadeAtual = 0; 
    }

    public void parar()
    {
        velocidadeAtual = 0;
    }

    public String mostraVelocidade()
    {
        return String.format("Velocidade atual: %d", velocidadeAtual);
    }

    public String mostraInfos()
    {
        return String.format("Modelo: %s | Fabricante: %s | Ano: %d\n", modelo, fabricante, ano);
    }
}
