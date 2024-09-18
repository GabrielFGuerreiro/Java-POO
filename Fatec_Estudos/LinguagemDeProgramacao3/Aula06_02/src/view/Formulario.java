package view;

import business.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario
{
    private JFrame form;
	private JLabel lblValor1, lblValor2, lblResult;
	private JTextField txtValor1, txtValor2;
	private JButton btnSoma, btnSubtra, btnMulti, btnDivi;
    
    Calculo conta = null;

    public Formulario()
	{
		inicializarComponentes();
	}

    public void inicializarComponentes()
    {
        form = new JFrame("Calculadora");
        form.setBounds(500, 200, 500, 400);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(null);
        
        Container painelDeConteudo = form.getContentPane(); 
        Font fonte1 = new Font("Arial", Font.BOLD, 14);
        Font fonte2 = new Font("Arial", Font.BOLD, 25);
        
        
        lblValor1 = new JLabel("Valor 1");
        lblValor1.setBounds(100, 60, 50, 20);
        lblValor1.setFont(fonte1);
        painelDeConteudo.add(lblValor1);

        lblValor2 = new JLabel("Valor 2");
        lblValor2.setBounds(200, 60, 50, 20);
        lblValor2.setFont(fonte1);
		painelDeConteudo.add(lblValor2);
        
        lblResult = new JLabel();
        lblResult.setBounds(350, 100, 1000, 20);
        lblResult.setFont(fonte2);
        painelDeConteudo.add(lblResult);

        txtValor1 = new JTextField();
		txtValor1.setBounds(100, 80, 50, 30);
		painelDeConteudo.add(txtValor1);

        txtValor2 = new JTextField();
		txtValor2.setBounds(200, 80, 50, 30);
		painelDeConteudo.add(txtValor2);

        //Botão soma
        btnSoma = new JButton("+");
		btnSoma.setBounds(100, 150, 50, 50);
        btnSoma.setFont(fonte2);
		btnSoma.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                conta = new Adicao(); //Objeto criado com a classe adicao
                mudaTextoResultado();
			}
		});

        //Botão subtração
        btnSubtra = new JButton("-");
		btnSubtra.setBounds(200, 150, 50, 50);
        btnSubtra.setFont(fonte2);
		btnSubtra.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                conta = new Subtracao();
                mudaTextoResultado();
			}
		});

        //Botão multiplicação
        btnMulti = new JButton("x");
        btnMulti.setBounds(100, 250, 50, 50);
        btnMulti.setFont(fonte2);
        btnMulti.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                conta = new Multiplicacao();
                mudaTextoResultado();
            }
        });
       
        //Botão divisão
        btnDivi = new JButton("/");
		btnDivi.setBounds(200, 250, 50, 50);
        btnDivi.setFont(fonte2);
		btnDivi.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                conta = new Divisao();
                mudaTextoResultado();
			}
		});

        painelDeConteudo.add(btnSoma);
        painelDeConteudo.add(btnSubtra);
        painelDeConteudo.add(btnMulti);
        painelDeConteudo.add(btnDivi);
        form.setVisible(true);
    }

    void mudaTextoResultado()
    {
        //O if trata o erro de divisão por 0
        if(conta instanceof Divisao && Float.parseFloat(txtValor2.getText()) == 0)
        {
            lblResult.setText("ERRO");
            JOptionPane.showMessageDialog(form, "Divisão por 0", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //Método recebe <-- String para float <-- Pega o valor
            conta.setValor1(Float.parseFloat(txtValor1.getText()));
            conta.setValor2(Float.parseFloat(txtValor2.getText()));
            conta.calcular(); //Calcula e atribui ao "resultado"
            
            //Muda o texto <-- float para String <-- Pega o resultado
            lblResult.setText(String.valueOf(conta.getResultado()));
        }

    }
}
