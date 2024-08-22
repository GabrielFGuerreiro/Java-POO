package exercicio17;

public class Destrutor
{
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	
	Destrutor(String marca, String modelo, String cor, double preco)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.cor=cor;
		this.preco=preco;
	}
	
	String dados;
	
	public String mostra()
	{
		dados="MARCA:\t" + marca +"\n" + "MODELO:\t" + modelo
		+ "\n" + "COR:\t" + cor + "\n" + "PREÇO:" + preco;
		return dados;
	}
}