package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;


public class Formulario
{
	private JFrame form;
	private JLabel lblNome;
	private JTextField txtNome;
	private JButton btnExibirMensagem;

	public Formulario()
	{
		inicializarComponentes();
	}

	private void inicializarComponentes()
	{	
		form = new JFrame("Meu primeiro JFrame");
		form.setBounds(400, 250, 500, 300);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(null);
		
		Container painelDeConteudo = form.getContentPane(); 
		Font fonte = new Font("Arial", Font.BOLD, 16); //Cria um estilo 

		lblNome = new JLabel("Nome");
		lblNome.setBounds(50, 60, 45, 25);
		lblNome.setFont(fonte); //Aplicando o estilo de fonte no label
		lblNome.setForeground(Color.decode("#00ffff")); //Muda a cor do texto para azul (valor escolhido por hexadecimal)
		//lblNome.setForeground(Color.BLUE); //Muda a cor do texto para azul (cor já existente)
		painelDeConteudo.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(100, 60, 300, 25);
		txtNome.setFont(fonte); //Aplicando o estilo de fonte no textfield
		painelDeConteudo.add(txtNome);

		btnExibirMensagem = new JButton("Exibir mensagem");
		btnExibirMensagem.setBounds(100, 130, 300, 30);
		btnExibirMensagem.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String textoUser = txtNome.getText(); 
				JOptionPane.showMessageDialog(form, textoUser, "Mensagem", 1);
			}
		});

		painelDeConteudo.add(btnExibirMensagem); 

		form.setVisible(true);
	}
}


