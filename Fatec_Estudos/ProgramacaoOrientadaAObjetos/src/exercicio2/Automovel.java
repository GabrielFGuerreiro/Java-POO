package exercicio2;

public class Automovel
{
	String modelo,cor,marca;
	double preco;
	
	public void Informa_Automovel()
	{
		System.out.println("Marca do carro: \t" + marca);
		System.out.println("Modelo: \t" + modelo);
		System.out.println("Cor do carro: \t" + cor);
		System.out.println("Preço  do carro: \t" + preco);
	}
}