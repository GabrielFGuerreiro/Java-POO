package view;

import business.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formulario
{
    private JFrame form;
	private JLabel lblNome, lblCPF, lblSaldo, lblnumero;
	private JTextField txtNome, txtCPF, txtSaldo, txtMexeSaldo, txtNumero;
	private JButton btnCadastrar, btnMostraInfos;
    private ArrayList<Cliente> clientes; //Lista cliente
    Cliente novoCliente;

    public Formulario(ArrayList<Cliente> clientes)
    {
        this.clientes = clientes; //Lista cliente
        inicializarComponentes();
    }
    
    public void inicializarComponentes()
    {
        form = new JFrame("Cadastro");
        form.setBounds(500, 200, 500, 400);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(null);

        Container painelDeConteudo = form.getContentPane(); 

        lblNome = new JLabel("Nome");
        lblNome.setBounds(50, 60, 50, 20);
        painelDeConteudo.add(lblNome);

        lblCPF = new JLabel("CPF");
        lblCPF.setBounds(150, 60, 50, 20);
        painelDeConteudo.add(lblCPF);

        lblSaldo = new JLabel("Saldo");
        lblSaldo.setBounds(250, 60, 50, 20);
        painelDeConteudo.add(lblSaldo);

        lblnumero = new JLabel("Número da conta");
        lblnumero.setBounds(350, 60, 100, 20);
        painelDeConteudo.add(lblnumero);

        //=====//

        txtNome = new JTextField();
        txtNome.setBounds(50, 80, 50, 30);
		painelDeConteudo.add(txtNome);
        
        txtCPF = new JTextField();
        txtCPF.setBounds(150, 80, 50, 30);
		painelDeConteudo.add(txtCPF);

        txtSaldo = new JTextField();
        txtSaldo.setBounds(250, 80, 50, 30);
		painelDeConteudo.add(txtSaldo);

        txtNumero = new JTextField();
        txtNumero.setBounds(350, 80, 100, 30);
		painelDeConteudo.add(txtNumero);

        //Botão cadastrar
        btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.setBounds(100, 150, 130, 50);
        btnCadastrar.setBackground(Color.decode("#008000"));
        btnCadastrar.setForeground(Color.white);
        btnCadastrar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{             
                if (!txtNome.getText().isEmpty() && !txtCPF.getText().isEmpty() && !txtNumero.getText().isEmpty())
                {
                    Conta conta = new Conta(Integer.parseInt(txtNumero.getText()), Integer.parseInt(txtSaldo.getText())); //Objeto conta
                    novoCliente = new Cliente(txtNome.getText(), txtCPF.getText(), conta); //Objeto cliente. Associação de cliente e conta
                    clientes.add(novoCliente); //Lista(objeto)
                    JOptionPane.showMessageDialog(form, "Cliente cadastrado com sucesso!");
                    txtNome.setText("");
                    txtCPF.setText("");
                    txtNumero.setText("");
                    txtSaldo.setText("");
                } else
                    JOptionPane.showMessageDialog(form, "Por favor, preencha todos os campos.");
			}
		});

        

        painelDeConteudo.add(btnCadastrar);
 
        form.setVisible(true);
    }

    
}
