/*Modificar a classe Automóvel: encapsular os atributos como private e
inserir os métodos set ( ) e get ( ) para cada um deles. */


import javax.swing.JOptionPane;

public class Automovel_exerc
{
	private String modelo,cor,marca;
	private double preco;
	

   public void setModelo(String modelo) {this.modelo=modelo;}
   public void setCor(String cor) {this.cor=cor;}
   public void setMarca(String marca) {this.marca=marca;}
   public void setPreco(double preco) {this.preco=preco;}

   public String getModelo() {return modelo;}
   public String getCor() {return cor;}
   public String getMarca() {return marca;}
   public double getPreco() {return preco;}
 
   public void Informa_Automovel()
   {	
      JOptionPane.showMessageDialog(null,"Marca do carro: "+getMarca()+
      "\nModelo do carro: "+getModelo()+"\nCor do carro: "+getCor()+"\nPreço do carro: "+getPreco());
   }
}
