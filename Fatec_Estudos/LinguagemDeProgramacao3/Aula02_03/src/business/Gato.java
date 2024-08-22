package business;

public class Gato extends Animal
{
    public Gato(String nome)
    {
        super(nome);
    }
    
    @Override
    public String brincar()
    {
		return String.format("O gato %s brinca arranhando o sofa.", nome);
    }

    public String miar()
    {
        return("MIAU MIAU MIAU");
    }

    @Override
	public String toString()
    {
		return String.format("Espécie: gato; nome: %s; peso: %.1f kg; idade: %d anos",
				nome, peso, idade);
	}	

}
