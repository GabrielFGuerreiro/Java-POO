package business;

public class Moto extends Veiculo
{
    private boolean descansoAcionado = true;
    private Motor motor;
    private Manutencao manutencao;

    public Moto(String modelo, String fabricante, int ano, Motor motor, Manutencao manutencao)
    {
        super(modelo, fabricante, ano);
        this.motor = motor;
        this.manutencao = manutencao; 
    }

    @Override
    public void acelerar()
    {
        super.acelerar();
        descansoAcionado = false;
    }

    @Override
    public void desacelerar()
    {
        super.desacelerar();
        descansoAcionado = (velocidadeAtual == 0) ? true : false;
    }

    @Override
    public void parar()
    {
        super.parar();
        descansoAcionado = true;
    }

    @Override
    public String mostraVelocidade()
    {
        return String.format("Velocidade atual: %d\nDescanso acionado: %s\n%s\n%s", velocidadeAtual, descansoAcionado, motor.toString(), manutencao.toString());
    }    
}
