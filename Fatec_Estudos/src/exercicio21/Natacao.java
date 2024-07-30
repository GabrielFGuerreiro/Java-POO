package Abstrata;

public class Natacao extends Atividade
{
    public Natacao(int duracao) 
    {
        super("Nado", duracao);
    }

    public void FazerAtividade()
    {
        System.out.println("Realizando a atividade: " + getNome() + " por " + getDuracao() + " minutos.");
    }
}
