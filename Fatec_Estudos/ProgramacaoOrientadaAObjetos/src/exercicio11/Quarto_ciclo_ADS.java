package exercicio11;

public class Quarto_ciclo_ADS extends Secretaria_escolar
{
    public static void main(String[] args)
    {
        //Chama o mét. const. padrão
        Secretaria_escolar  A = new Secretaria_escolar();
        Insere_Dados(A); //É possível passar a variável de instância como parâmetro

        //Chama o mét. const. padrão, passando parâmetros
        Secretaria_escolar B = new Secretaria_escolar("Maria",22,7.7,"ADS");
        Insere_Dados(B); //É possível passar a variável de instância como parâmetro
    }

    public static void Insere_Dados(Secretaria_escolar C) //Recebendo o valor da variável de instância por parâmetro
    {
        System.out.println("Nome do aluno: \t" + C.getNome() + "\nIdade do aluno: \t" + C.getIdade() +
        "\nMédia do aluno: \t" + C.getMedia() + "\nCurso do aluno: \t" + C.getCurso());            
    }
}