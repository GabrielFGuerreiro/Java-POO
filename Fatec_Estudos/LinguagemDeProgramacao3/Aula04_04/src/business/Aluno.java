package business;

public class Aluno extends Pessoa
{
    private String matricula;

    public Aluno(String nome, String email, String matricula)
    {
        super(nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() {return matricula;}
}
