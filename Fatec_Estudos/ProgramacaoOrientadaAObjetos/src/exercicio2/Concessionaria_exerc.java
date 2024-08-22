package exercicio2;

import javax.swing.JOptionPane;	
public class Concessionaria_exerc
{
	public static void main(String[] args)
	{
		Automovel_exerc auto = new Automovel_exerc();

		auto.setModelo(JOptionPane.showInputDialog("Digite o modelo:"));
		auto.setCor(JOptionPane.showInputDialog("Digite a cor:"));
		auto.setMarca(JOptionPane.showInputDialog("Digite a marca:"));
		auto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:")));
		/*metodo set   metodo de conversão              recebendo o valor
		Forma separada:
		x=JOptionPane.showInputDialog("Digite o preço:");
		y=Double.parseDouble(x);
		auto.setPreco(y);*/
		auto.Informa_Automovel();

	}
}