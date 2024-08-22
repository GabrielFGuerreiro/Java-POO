package business;


public class Aluno extends Pessoa
{
    private int ra;

    public Aluno(String nome, String email, int ra)
    {
        // executa o construtor da superclasse tal como ele é esperado
        super(nome, email);
        this.ra = ra;
    }
    
    @Override
	public String cumprimentar()
    {
		return super.cumprimentar() + " Meu RA eh " + ra;
	}
}
