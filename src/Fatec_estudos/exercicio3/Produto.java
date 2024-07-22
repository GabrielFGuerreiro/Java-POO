package exemplo3;

public class Produto
{
	String nome;
	String marca;
	float valor;

	//construtor padrão
	Produto()
	{

	}

	Produto(String nome, String marca)
	{
		//serve para diferenciar entre a variável e o parâmetro que possuem o mesmo nome (nao é obrigatorio ser o msm)
		this.nome = nome;
		this.marca = marca;
	}

	Produto(String nome, String marca, float valor)
	{
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

}