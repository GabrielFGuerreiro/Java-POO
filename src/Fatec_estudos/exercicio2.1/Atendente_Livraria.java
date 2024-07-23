
import javax.swing.JOptionPane;

public class Atendente_Livraria
{
	public static void main(String args[])
	{
		Livraria cultura = new	Livraria();
		
		String edi,aut,book,a,b,c;
		int cd,quant;
		double prec;
		
		//mostrar uma mensagem
		JOptionPane.showMessageDialog(null, "[Categorias]\n1 para Romance\n2 para Espírita\n3 para Informática");
		a=JOptionPane.showInputDialog(null,"Código"); //recebe e dps retorna o codig
		edi=JOptionPane.showInputDialog(null,"Editora");
		aut=JOptionPane.showInputDialog(null,"Autor");
		book=JOptionPane.showInputDialog(null,"Livro");
		b=JOptionPane.showInputDialog(null,"Quantidade");
		c=JOptionPane.showInputDialog(null,"Preço");

		//convertendo string-->int (codigo)
		cd=Integer.parseInt(a);
		//convertendo string-->int (quantidade)
		quant=Integer.parseInt(b);
		//convertendo string-->double (preço)
		prec=Double.parseDouble(c);

		cultura.editora=edi;
		cultura.autor=aut;
		cultura.livro=book;
		cultura.qnt=quant;
		cultura.preco=prec;
		
		cultura.Informa_Livros(cd);
	}
}