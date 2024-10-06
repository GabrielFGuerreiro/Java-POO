package business;

public class Horario
{
    private Hora hora;
    private Minuto minuto;

    public Horario(int h, int min) //2.Recebe os valores
    {
        this.hora = new Hora();  //3.0.Cria a instância de hora
        this.hora.setUnidade(h); //4.0.Leva o valor para o método de Hora

        this.minuto = new Minuto();  //3.1.Cria a instância de minuto
        this.minuto.setUnidade(min); //4.1.Leva o valor para o método de Minuto
    }

    //Retorna o objeto hora que possui acesso ao valor da unidade hora
    public Hora getHora() {return hora;}

    //Retorna o objeto minuto que possui acesso ao valor da unidade minuto
    public Minuto getMinuto() {return minuto;}
}