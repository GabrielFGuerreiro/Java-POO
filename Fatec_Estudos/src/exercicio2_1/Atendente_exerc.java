
import javax.swing.JOptionPane;

public class Atendente_exerc
{
	public static void main(String[] args)
	{
		Livraria_exerc cultura = new Livraria_exerc();
		
		String a;
		int cd;
		
		//mostrar uma mensagem
		JOptionPane.showMessageDialog(null, "[Categorias]\n1 para Romance\n2 para Espírita\n3 para Informática");

		a=JOptionPane.showInputDialog(null,"Código"); //recebe e dps retorna o codig
		cultura.setEditora(JOptionPane.showInputDialog(null,"Editora"));
		cultura.setAutor(JOptionPane.showInputDialog(null,"Autor"));
        cultura.setLivro(JOptionPane.showInputDialog(null,"Livro"));

        //metodo set   metodo de conversão              recebendo o valor
		cultura.setQnt(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade: ")));
        cultura.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Preço")));
		
		cd=Integer.parseInt(a);		//convertendo string-->int (codigo)
		cultura.Informa_Livros(cd);
	}
}