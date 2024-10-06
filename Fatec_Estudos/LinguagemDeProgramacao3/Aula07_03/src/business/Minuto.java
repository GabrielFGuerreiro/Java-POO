package business;

public class Minuto extends Tempo
{
    @Override
    public void setUnidade(int minuto) //5.1.Recebe o valor do acesso na classe horário
    {
        super.setUnidade(minuto); //6.1.Leva o valor para o método da super
    }

    @Override
    public void incrementaUnidade(int u) {super.incrementaUnidade(u);}

    @Override
    public void decrementaUnidade(int u) {super.decrementaUnidade(u);}
}
