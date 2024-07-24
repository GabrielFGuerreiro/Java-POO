package exemplo9;

import javax.swing.JOptionPane;

public class Infos_pada2
{
    public static void main(String[] args)
    {
        Padaria2 padoca2 = new Padaria2();

        padoca2.setNome(JOptionPane.showInputDialog(null, "Nome da padaria: "));
        //Leva pro set      |     converte    | Recebe
        padoca2.setValorpao(Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do pão: "))); 
        padoca2.setValorcafe(Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do café: "))); 
        padoca2.setNumpao(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de pães atual: ")));


        System.out.println("O nome da padaria é: "+padoca2.getNome()+"\nO valor do pão é: "+padoca2.getValorpao()+
        "\nO valor do café é: "+padoca2.getValorcafe()+"\nQuantidade de pães: "+padoca2.getNumpao()); 
        //numpao= não há set, apenas constr. e get (nao seria possivel alterar depois)

    }
}