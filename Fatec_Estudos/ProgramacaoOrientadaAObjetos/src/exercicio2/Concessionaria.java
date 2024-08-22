package exercicio2;

//importando a classe JOptionPane do pacote javax.swing (biblioteca swing, conjunto de classes para criar interfaces gráficas de usuário (GUI) em Java) 
import javax.swing.JOptionPane;	
public class Concessionaria
{
	public static void main(String[] args)
	{
		Automovel e = new Automovel();
		
		String mr,md,pr,cr;
		double pc;

		//O método JOptionPane exibe uma caixa de diálogo de entrada de texto.
		mr=JOptionPane.showInputDialog("Digite a marca:");
		md=JOptionPane.showInputDialog("Digite o modelo:");
		cr=JOptionPane.showInputDialog("Digite a cor:");
		pr=JOptionPane.showInputDialog("Digite o preço:");
		
		/*converção da string em um valor numérico do tipo double
		pr: variável do tipo String que contém um valor numérico representado como uma sequência de caracteres
		pc: variável do tipo double que armazenará o valor convertido*/
		pc=Double.parseDouble(pr);
		
		e.marca=mr;
		e.modelo=md;
		e.cor=cr;
		e.preco=pc;
		
		e.Informa_Automovel();
	}
}