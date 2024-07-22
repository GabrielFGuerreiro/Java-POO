package exemplo4;

public class AlunoTestar
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno();

        //Não consegue acessar o var nome privada
        //aluno1.nome = "Fernanda"; 

        //o user poderia facilmente alterar os valores para qualquer coisa 
        //aluno1.idade=500; <--500 seria aceito pelo programa, mas não deveria

        //nome foi setado na var graças ao método set
        aluno1.setnome("Fernanda");

        //printando o valor graças ao método get que retornou o valor
        System.out.println(aluno1.getnome());
        
        aluno1.setIdade(50);
    }
}
