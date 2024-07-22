package exemplo4;

public class Aluno
{
    //privaapenas pode ser acessado pela própria classe
    private String nome;
    private int idade;

    //recebendo o valor pelo parâmetro nome
    public void setnome(String nome)
    {
        //atribuindo o valor recevido da classe main à var nome
        this.nome=nome;
    }

    //não recebe nada. Retorna uma String para 
    public String getnome()
    {
        //retornando o valor  da var nome para a classe main
        return nome;
    }

    public void setIdade(int idade)
    {
        if(idade>0 && idade<130)
        {
            this.idade=idade;
            System.out.println("Idade cadastrada:"+idade);
        }
        else
            System.out.println("Erro! Idade inválida");
    }
}
