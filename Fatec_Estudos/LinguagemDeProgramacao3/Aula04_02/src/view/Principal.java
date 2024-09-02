package view;

import javax.swing.JOptionPane;

import business.Veiculo;
import business.Carro;
import business.Moto;
import business.Motor;

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
        Motor motor = new Motor(150, "Flex");

        switch(op)
        {
            case "c":
            case "C":                                         //Leva o objeto motor (e seus valores)
                veiculo = new Carro("Civic", "Honda", 2021, motor);
                break;

            case "m":
            case "M":                                         //Leva o objeto motor (e seus valores)
                veiculo = new Moto("Ninja 300", "Kawasaki", 2023, motor);
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
