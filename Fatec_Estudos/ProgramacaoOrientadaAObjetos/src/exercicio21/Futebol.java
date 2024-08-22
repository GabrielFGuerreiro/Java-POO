package exercicio21;

class Futebol extends Atividade
{
    public Futebol(int duracao)
    {
        super("Corrida", duracao);
    }

    public void FazerAtividade()
    {
        System.out.println("Realizando a atividade: " + getNome() + " por " + getDuracao() + " minutos.");
    }
}
