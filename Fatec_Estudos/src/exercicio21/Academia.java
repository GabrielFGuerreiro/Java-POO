package exercicio21;

public class Academia
{
    public static void main(String[] args)
    {
        Atividade nado = new Natacao(15);
        Atividade corrida = new Futebol(20);
        
        nado.FazerAtividade();
        corrida.FazerAtividade();
    }
}
