package business;

public class Carro extends Veiculo
{
    private int quantidadePortas;
    private Motor motor;

    public Carro(String modelo, String fabricante, int ano, Motor motor)
    {
        super(modelo, fabricante, ano);
        this.motor = motor;
        this.quantidadePortas = 4;
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
        return String.format("Velocidade atual: %dkm/h\nQuantidade de portas: %d\n%s", velocidadeAtual, quantidadePortas, motor.toString());
    }
}
