package view;

import javax.swing.*;

import business.Avaliacao;
public class Principal
{
    public static void main(String[] args)
    {
        //>Cria< campos de entrada/texto
        JTextField p1Campo = new JTextField(5);  
        JTextField p2Campo = new JTextField(5);
        JTextField p3Campo = new JTextField(5);
        JTextField aulasTotaisCampo = new JTextField(5);
        JTextField presencasCampo = new JTextField(5);

        //>Cria< um painel para agrupar os campos
        JPanel meuPainel = new JPanel(); 

        //>Adiciona< os campos de texto e rótulos ao painel
        meuPainel.add(new JLabel("P1:"));  //Adiciona rótulo para o campo de P1
        meuPainel.add(p1Campo);                 //Adiciona campo de entrada para P1
        meuPainel.add(new JLabel("P2:"));
        meuPainel.add(p2Campo);
        meuPainel.add(new JLabel("P3:"));
        meuPainel.add(p3Campo);
        meuPainel.add(new JLabel("Aulas totais:"));
        meuPainel.add(aulasTotaisCampo);
        meuPainel.add(new JLabel("Presenças:"));
        meuPainel.add(presencasCampo);
        
        //JOption para inserir os valores
        int result = JOptionPane.showConfirmDialog(
        null,
        meuPainel, //Painel que foi criado
        "Informe as informações do aluno",
        JOptionPane.OK_CANCEL_OPTION);

        //Leva os valores pela chamada dos métodos
        if (result == JOptionPane.OK_OPTION)
        {
            Avaliacao avaliar = new Avaliacao();
            avaliar.calcularMedia(
            Float.parseFloat(p1Campo.getText()), //Pega os valores recebidos pelo campo (getText()) e transforma em float 
            Float.parseFloat(p2Campo.getText()),
            Float.parseFloat(p3Campo.getText()));

            avaliar.calcularPercentualPresenca(
            Integer.parseInt(aulasTotaisCampo.getText()),
            Integer.parseInt(presencasCampo.getText()));

            String mensagem = avaliar.informaResultado();

            JOptionPane.showMessageDialog(
            null,
            mensagem,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
}