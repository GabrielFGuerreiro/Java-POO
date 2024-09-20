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
	private JButton btnCadastrar, btnMostraInfos, btnDepositar, btnSacar;
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
        btnCadastrar.setBackground(Color.decode("#00bfff"));
        btnCadastrar.setForeground(Color.white);
        btnCadastrar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{             
                if (!txtNome.getText().isEmpty() && !txtCPF.getText().isEmpty() && !txtNumero.getText().isEmpty())
                {
                    Conta conta = new Conta(Integer.parseInt(txtNumero.getText()), Float.parseFloat(txtSaldo.getText())); //Objeto conta
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

        //Botão Informações
        btnMostraInfos = new JButton("PESQUISAR");
        btnMostraInfos.setBounds(250, 150, 130, 50);
        btnMostraInfos.setBackground(Color.decode("#ffff00"));
        btnMostraInfos.setForeground(Color.white);
        btnMostraInfos.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                
                mostraClientes(txtNome.getText());
			}
		});
        
        //Botão Depositar
        btnDepositar = new JButton("DEPOSITAR");
        btnDepositar.setBounds(100, 220, 130, 50);
        btnDepositar.setBackground(Color.decode("#008000"));
        btnDepositar.setForeground(Color.white);
        btnDepositar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                String operacao = "+";
                if(!txtNumero.getText().isEmpty())
                    mexeSaldo(Integer.parseInt(txtNumero.getText()), operacao);
                else
                    JOptionPane.showMessageDialog(form,"Digite o número da conta", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		});

        painelDeConteudo.add(btnCadastrar);
        painelDeConteudo.add(btnMostraInfos);
        painelDeConteudo.add(btnDepositar);
        form.setVisible(true);
    }

    //Método mostra cliente
    public void mostraClientes(String nomePesquisado)
    {
        for(Cliente cliente : clientes)
        {   
            Conta conta = cliente.getConta(); //Conta associada ao cliente pelo método getConta.
            //É uma simplificação de código, poderia usar o cliente.getConta() ao invés.
                                    //M = m
            if(cliente.getNome().equalsIgnoreCase(nomePesquisado))
            {
                JOptionPane.showMessageDialog(form, "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCPF() +
                "\nNúmero da conta: " + conta.getNumero() + "\nSaldo: " + conta.getSaldo(), //Outra forma: cliente.getConta().getSaldo()
                "Informações do Cliente", JOptionPane.INFORMATION_MESSAGE);
                return; //O return interrompe o método após achar o cliente correspondente
            }
        }
        JOptionPane.showMessageDialog(form, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    //Método mexe saldo
    public void mexeSaldo(int numeroConta, String operacao)
    {
        for (Cliente cliente : clientes)
        {
            Conta conta = cliente.getConta();
            if(conta.getNumero() == numeroConta) //Outra forma: cliente.getConta().getNumero()
            {
                String valor = JOptionPane.showInputDialog(form, "Qual valor deseja depositar?","Depósito", JOptionPane.DEFAULT_OPTION);
                conta.deposito(Integer.parseInt(valor));
                return;  //O return interrompe o método após achar o número correspondente
            }
        }      
        JOptionPane.showMessageDialog(form, "Número de conta não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
