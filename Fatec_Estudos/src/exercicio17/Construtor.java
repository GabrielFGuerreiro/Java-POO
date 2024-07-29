package exercicio17;

public class Construtor
{
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	//método construtor na sua forma padrão:inicializa atributos com valores default
	Construtor(){}
	
	//método construtor para inicializar atributos com valores inseridos através de argumentos
	Construtor(int ano, String marca, String modelo, double preco)
	{
		this.ano=ano;
		this.marca=marca;
		this.modelo=modelo;
		this.preco=preco;
	}
	
	static
	{
	cor="verde";
	}
	
	public void mostradados()
	{
	System.out.println("\n"+"carro marca:" + "\t" + marca + "\n"
	+ "modelo" + "\t" + modelo + "\n" + "ano:" + "\t" + ano + "\n"
	+ "cor" + "\t" + cor + "\n" +  "preco" + "\t" + preco);
	}

}