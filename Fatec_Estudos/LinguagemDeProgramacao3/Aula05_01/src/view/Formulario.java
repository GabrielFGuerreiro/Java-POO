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

public class Formulario
{
	private JFrame form;
	private JLabel lblNome;
	private JTextField txtNome;
	private JButton btnExibirMensagem;

	private JButton btnOutroBotaoParaTestes;

	public Formulario()
	{
		inicializarComponentes();
	}

	private void inicializarComponentes()
	{	
		//Instancia objeto do tipo JFrame
		form = new JFrame("Meu primeiro JFrame");
		//Configura posição ("x" e "y") e tamanho ("width" e "height") 
		form.setBounds(400, 250, 500, 300);
		//Define operação padrão que ocorre quando o formulário for fechado
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Elimina pré-configurações de layout
		form.setLayout(null);
		
		/*Recebe instância do painel de conteúdo para adicionar elementos:
		Retorna o painel de conteúdo do JFrame (componentes visíveis dentro da janela, como botões, labels, etc.).
		Armazena o painel de conteúdo do JFrame no objeto painelDeConteudo do tipo Container*/
		Container painelDeConteudo = form.getContentPane(); 
		
		//Instancia objeto do tipo JLabel
		lblNome = new JLabel("Nome");
		lblNome.setBounds(50, 60, 40, 25);
		//Adiciona JLabel à área de conteúdo do formulário
		painelDeConteudo.add(lblNome);
		
		//Instancia objeto do tipo JTextField
		txtNome = new JTextField();
		txtNome.setBounds(100, 60, 300, 25);
		//Adiciona JTextField à área de conteúdo do formulário
		painelDeConteudo.add(txtNome);
		
		//Instancia objeto do tipo JButton
		btnExibirMensagem = new JButton("Exibir mensagem");
		btnExibirMensagem.setBounds(100, 130, 300, 30);
		/*Instancia objeto anônimo, a partir da construção de uma classe
		anônima (aninhada) que, por sua vez, implementa a interface ActionListener para
		poder executar o método de ação do botão*/
		/*Está adicionando um ouvinte de ação (ActionListener) ao botão btnExibirMensagem.
		Isso significa que quando o botão for clicado, o código dentro do método actionPerformed será executado*/
		btnExibirMensagem.addActionListener(new ActionListener()
		{
			/*Cria um novo ouvinte de ação (um objeto que implementa a interface ActionListener).
			Dentro dessa interface, você deve implementar o método actionPerformed, que define o que
			acontece quando a ação ocorre (neste caso, quando o botão é clicado).*/
			@Override
			public void actionPerformed(ActionEvent e)
			{
				/*Esse método é chamado quando o evento de ação ocorre (por exemplo, quando o botão
				é clicado). Ele recebe um objeto ActionEvent, que contém informações sobre o evento
				(como a fonte do clique, etc.).*/
				JOptionPane.showMessageDialog(null, "Olá, mundo!");
			}
		});
		//Adiciona o botão à área de conteúdo do formulário
		painelDeConteudo.add(btnExibirMensagem); 

		//Dá visibilidade ao formulário
		form.setVisible(true);
	}
}


