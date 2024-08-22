package business;

public class Professor extends Pessoa
{
    public Professor(String nome, String email)
    {
        super(nome, email);
    }

    @Override
    public String cumprimentar()
    {
		return String.format("Ola, sou o Prof. %s.", nome);
    }

    public String cumprimentar(String tratamento)
    {
        return String.format("Ola, sou o Prof. %s %s.", tratamento, nome);
    }
}
