package exercicio13;

import javax.swing.*;

public class Empresa_de_construcao
{
    public static void main (String[] args)
    {
        Construcao pedreiro = null;

        int tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo" +
        " de construção\n" + "1=CASA, 2=APARTAMENTO e 3=TUDO"));

        switch(tipo_construcao)
        {
            case 1:
                pedreiro = new Casa(); break;
        
            case 2:
                pedreiro = new Apartamento(); break;

            case 3:
                pedreiro = new Construcao(); break;
            
            default:
                System.out.println("CONSTRUÇÂO INDEFINIDA");
                System.exit(0);
        }
        //chama o método específico de acordo com a classe acessada no switch
        pedreiro.constroi(); 
    }
}
