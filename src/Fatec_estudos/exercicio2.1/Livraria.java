package exemplo2_1;
import javax.swing.JOptionPane;	

public class Livraria
{
	
String editora,autor,livro;
int qnt;
double preco;

//metodo que recebe como parametro o codigo
public void Informa_Livros(int codigo)
{	
	switch(codigo)
	{
	case 1: JOptionPane.showMessageDialog (null,"CATEGORIA ROMANCE \n" +
	"LIVRO: " + livro +
	"\nEDITORA： " + editora +
	"\n AUTOR: " + autor +
	"\n Quantidade: " + qnt +
	"\n PREÇO: "  + preco,"",JOptionPane.PLAIN_MESSAGE);
	break;

	case 2: JOptionPane.showMessageDialog (null,"CATEGORIA ESPÍRITA \n" +
	"LIVRO: " + livro +
	"\nEDITORA： " + editora +
	"\n AUTOR: " + autor +
	"\n Quantidade: " + qnt +
	"\n PREÇO: "  + preco,"",JOptionPane.PLAIN_MESSAGE);
	break;
	
	case 3: JOptionPane.showMessageDialog (null,"CATEGORIA INFORMÁTICA \n" +
	"LIVRO: " + livro +
	"\nEDITORA： " + editora +
	"\n AUTOR: " + autor +
	"\n Quantidade: " + qnt +
	"\n PREÇO: "  + preco,"",JOptionPane.PLAIN_MESSAGE);
	break;
	
	default: System.out.println("Código não corresponde a nenhuma categoria de livro");
	}
}
}