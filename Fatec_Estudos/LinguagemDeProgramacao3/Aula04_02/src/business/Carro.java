package business;

public class Carro extends Veiculo
{
    private int quantidadePortas;
    private Motor motor;
    private Manutencao manutencao;

    public Carro(String modelo, String fabricante, int ano, Motor motor, Manutencao manutencao)
    {
        super(modelo, fabricante, ano);
        this.quantidadePortas = 4;
        this.motor = motor;
        this.manutencao = manutencao;        
    }

    @Override
    public void acelerar()
    {
        velocidadeAtual += 10;
        if(velocidadeAtual > 180) this.velocidadeAtual = 180;
    }

    @Override
    public void desacelerar()
    {
        velocidadeAtual -= 10;
        if(velocidadeAtual < 0) this.velocidadeAtual = 0;        
    }

    @Override
    public void parar()
    {
        velocidadeAtual = 0;
    }

    @Override
    public String mostraVelocidade()
    {
        return String.format("Velocidade atual: %dkm/h\nQuantidade de portas: %d\n%s\n%s", velocidadeAtual, quantidadePortas, motor.toString(), manutencao.toString());
    }
}
