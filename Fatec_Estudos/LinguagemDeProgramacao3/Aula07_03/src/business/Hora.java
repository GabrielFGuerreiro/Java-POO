package business;

public class Hora extends Tempo
{
    @Override
    public void setUnidade(int h) //5.0.Recebe o valor do acesso na classe horário
    {
        super.setUnidade(h); //6.0.Leva o valor para o método da super
    }

    @Override
    public void incrementaUnidade(int u) {super.incrementaUnidade(u);}

    @Override
    public void decrementaUnidade(int u) {super.decrementaUnidade(u);}
}
