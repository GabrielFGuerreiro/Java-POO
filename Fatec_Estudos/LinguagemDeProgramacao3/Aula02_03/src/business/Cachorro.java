package business;

public class Cachorro extends Animal
{
    public Cachorro(String nome)
    {
        super(nome);
    }

	@Override
	public String brincar()
    {
		return String.format("O cachorro %s brinca pegando bolinha.", nome);
	}

    public String latir()
    {
        return("AU AU AU");
    }

    @Override
	public String toString()
    {
		return String.format("Espécie: Cachorro; nome: %s; peso: %.1f kg; idade: %d anos",
				nome, peso, idade);
	}	
}
