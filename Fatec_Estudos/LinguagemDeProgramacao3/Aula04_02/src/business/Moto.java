package business;

public class Moto extends Veiculo
{
    private boolean descansoAcionado = true;

    public Moto(String modelo, String fabricante, int ano)
    {
        super(modelo, fabricante, ano);
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
        return String.format("Velocidade atual: %d\nDescanso acionado: %s", velocidadeAtual, descansoAcionado);
    }
    
}
