/*Modificar a classe Livraria: encapsular os atributos como private e
inserir os métodos set ( ) e get ( ) para cada um deles. */

import javax.swing.JOptionPane;	

public class Livraria_exerc
{
	
private String editora,autor,livro;
private int qnt;
private double preco;


public void setEditora(String editora) {this.editora=editora;}
public void setAutor(String autor) {this.autor=autor;}
public void setLivro(String livro) {this.livro=livro;}
public void setQnt(int qnt) {this.qnt=qnt;}
public void setPreco(double preco) {this.preco=preco;}

public String getEditora() {return editora;}
public String getAutor() {return autor;}
public String getLivro() {return livro;}
public int getQnt() {return qnt;}
public double getPreco() {return preco;}


//metodo que recebe como parametro o codigo
public void Informa_Livros(int codigo)
{	
	switch(codigo)
	{
	case 1: JOptionPane.showMessageDialog (null,"CATEGORIA ROMANCE \n" +
	"LIVRO: " + getLivro() +
	"\nEDITORA： " + getEditora() +
	"\n AUTOR: " + getAutor() +
	"\n Quantidade: " + getQnt() +
	"\n PREÇO: "  + getPreco(),"",JOptionPane.PLAIN_MESSAGE);
	break;

	case 2: JOptionPane.showMessageDialog (null,"CATEGORIA ESPÍRITA \n" +
	"LIVRO: " + getLivro() +
	"\nEDITORA： " + getEditora() +
	"\n AUTOR: " + getAutor() +
	"\n Quantidade: " + getQnt() +
	"\n PREÇO: "  + getPreco(),"",JOptionPane.PLAIN_MESSAGE);
	break;
	
	case 3: JOptionPane.showMessageDialog (null,"CATEGORIA INFORMÁTICA \n" +
	"LIVRO: " + getLivro() +
	"\nEDITORA： " + getEditora() +
	"\n AUTOR: " + getAutor() +
	"\n Quantidade: " + getQnt() +
	"\n PREÇO: "  + getPreco(),"",JOptionPane.PLAIN_MESSAGE);
	break;
	
	default: System.out.println("Código não corresponde a nenhuma categoria de livro");
	}
}
}