package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario
{
	private JFrame form;
	private JLabel label;
	private JTextField caixaDeTexto;
	
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
		
		//Dá visibilidade ao formulário
		form.setVisible(true);
	}	
}