package view;

import javax.swing.JOptionPane;

import business.Veiculo;
import business.Carro;
import business.Moto;

public class Principal
{
    public static void main(String[] args)
    {
        String op = "";

        while(!op.equals("c") && !op.equals("C") && !op.equals("m") && !op.equals("M"))
        {
            op = JOptionPane.showInputDialog("Qual veículo deseja utilizar?\nC-carro\nM-moto");

            if (!op.equals("c") && !op.equals("C") && !op.equals("m") && !op.equals("M"))
            {
                JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", 0);
            }
        }

        Veiculo veiculo = null;

        switch(op)
        {
            case "m":
            case "M":
                veiculo = new Moto("modelo1", "fabricante1", 2017);
                break;

            case "c":
            case "C":
                veiculo = new Carro("modelo2", "fabricante2", 2019);
                break;
            
            default:
                break;
        }
        
        while(true)
        {
            String mensagem = veiculo.mostraVelocidade();
            String titulo = veiculo.mostraInfos();
            int result = JOptionPane.showOptionDialog(
                null,
                titulo +
                mensagem ,
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new String[] {"Acelerar", "Desacelerar", "Parar"},
                null
            );
            
            if(result == 0)
                veiculo.acelerar();
            else if(result == 1)
                veiculo.desacelerar();
            else  if(result == 2)
                veiculo.parar();  
            else if(result == JOptionPane.CLOSED_OPTION)
                break;
        }
    }
}
