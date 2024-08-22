package exercicio15;

public class ADS extends Fatec
{
    Fatec curso1 = new Fatec();

    public ADS()
    {
        curso1.mostracurso();

        curso1.setNomecurso("Tecnologia em Análise e Desenvolvimento de Sistemas");
        curso1.setQNTDalunos((100));

        curso1.attalunos(50);
        curso1.mostracurso();

        mostracurso();
    }

    public void mostracurso()
    {
        curso1.setNomecurso("Bacharel em Análise e Desenvolvimento de Sistemas");
        curso1.setQNTDalunos((40));
        System.out.println("Nome do curso: " + curso1.getNomecurso() +
        "\nQuantidade de alunos: " + curso1.getQNTDalunos());
    }
}
