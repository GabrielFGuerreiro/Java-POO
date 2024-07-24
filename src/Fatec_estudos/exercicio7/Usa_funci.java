//Herança 2

package exemplo7;

import javax.swing.JOptionPane;

public class Usa_funci
{
    public static void main (String[] args)
    {
    //OBJETOS
    Funcionario funcionario = new Funcionario();
    Pessoa_juridica juri = new Pessoa_juridica();

    String name,rg,cart,z;
    int x;
 
    z=JOptionPane.showInputDialog("digite 1 se contribuinte é pessoa fisica \n digite 2 se é pessoa juridica");
 
    //conversão de string para int:
    x=Integer.parseInt(z);
    if(z.length()==1) //retorna o número de caracteres (comprimento) da string.
    {
        switch(x)
        {
            case 1:
            {
                name=JOptionPane.showInputDialog("escrever o nome do contribuinte: ");
                rg=JOptionPane.showInputDialog("escrever o RG do contribuinte: ");
                cart=JOptionPane.showInputDialog("escrever a identificação do cartão do contribuinte: ");

                funcionario.setNome(name);
                funcionario.setRG(rg);
                funcionario.setCartao(cart);
                System.out.println("NOME: " + funcionario.getNome());
                System.out.println("RG: " + funcionario.getRG());
                System.out.println("CARTÃO: " + funcionario.getCartao());
                break;
            }
            case 2:
            {
                name=JOptionPane.showInputDialog ("escrever o nome do contribuinte: ");
                rg=JOptionPane.showInputDialog ("escrever o CNPJ do contribuinte: ");
                cart=JOptionPane.showInputDialog ("escrever a identificação do cartão do contribuinte: ");

                funcionario.setNome(name);
                juri.setCnpj(rg);
                funcionario.setCartao(cart);
                System.out.println("NOME: " + funcionario.getNome());
                System.out.println("CNPJ: " + juri.getCnpj());
                System.out.println("CARTÃO: " + funcionario.getCartao());
                break;
            }
        }//switch
    }//if
    }//void main()
}