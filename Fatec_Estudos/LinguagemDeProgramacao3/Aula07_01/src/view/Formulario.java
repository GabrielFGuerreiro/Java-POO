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
	private JTextField txtNome, txtCPF, txtSaldo, txtNumero;
	private JButton btnCadastrar, btnMostraInfos, btnDepositar, btnSacar, btnListaClientes, btnListaContas;
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
        form.setBounds(500, 200, 500, 450);
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
                    mexeSaldo(Integer.parseInt(txtNumero.getText()), operacao); //Se o número NÂO estiver vazio, chama o método mexeSaldo, leavndo o número da conta e a operaçao
                else //Se estiver vazio, dá erro
                    JOptionPane.showMessageDialog(form,"Digite o número da conta", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		});

        //Botão Saque
        btnSacar = new JButton("SACAR");
        btnSacar.setBounds(250, 220, 130, 50);
        btnSacar.setBackground(Color.decode("#ff0000"));
        btnSacar.setForeground(Color.white);
        btnSacar.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                String operacao = "-";
                if(!txtNumero.getText().isEmpty())
                    mexeSaldo(Integer.parseInt(txtNumero.getText()), operacao); //Se o número NÂO estiver vazio, chama o método mexeSaldo, leavndo o número da conta e a operaçao
                else //Se estiver vazio, dá erro
                    JOptionPane.showMessageDialog(form,"Digite o número da conta", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		});

        btnListaClientes = new JButton("LISTA CLIENTES");
        btnListaClientes.setBounds(100, 290, 130, 50);
        btnListaClientes.setBackground(Color.decode("#808080"));
        btnListaClientes.setForeground(Color.white);
        btnListaClientes.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                String tipo = "cliente";
                lista(tipo);
			}
		});

        btnListaContas = new JButton("LISTA CONTAS");
        btnListaContas.setBounds(250, 290, 130, 50);
        btnListaContas.setBackground(Color.decode("#808080"));
        btnListaContas.setForeground(Color.white);
        btnListaContas.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
                String tipo = "conta";
                lista(tipo);
			}
		});

        painelDeConteudo.add(btnCadastrar);
        painelDeConteudo.add(btnMostraInfos);
        painelDeConteudo.add(btnDepositar);
        painelDeConteudo.add(btnSacar);
        painelDeConteudo.add(btnListaClientes);
        painelDeConteudo.add(btnListaContas);
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
        //Sai do for se não encontrar o cliente
        JOptionPane.showMessageDialog(form, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    //Método mexe saldo
    public void mexeSaldo(int numeroConta, String operacao)
    {
        for (Cliente cliente : clientes)
        {
            Conta conta = cliente.getConta();
            if(conta.getNumero() == numeroConta && operacao.equals("+")) //Outra forma: cliente.getConta().getNumero()  //Depósito
            {
                String valor = JOptionPane.showInputDialog(form, "Qual valor deseja depositar?","Depósito", JOptionPane.DEFAULT_OPTION);
                conta.deposito(Integer.parseInt(valor));
                JOptionPane.showMessageDialog(form, "Depósito realizado com sucesso!");

                return;  //O return interrompe o método após achar o número correspondente
            }
            else if(conta.getNumero() == numeroConta && operacao.equals("-")) //Outra forma: cliente.getConta().getNumero()  //Saque
            {
                String valor = JOptionPane.showInputDialog(form, "Qual valor deseja sacar?","Saque", JOptionPane.DEFAULT_OPTION);
                conta.saque(Integer.parseInt(valor));
                JOptionPane.showMessageDialog(form, "Saque realizado com sucesso!");

                return;  //O return interrompe o método após achar o número correspondente
            }
        }      
        //Sai do for se não encontrar o número
        JOptionPane.showMessageDialog(form, "Número de conta não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    //Método lista cliente/conta
    public void lista(String tipo)
    {
        String lista = "";
        switch (tipo)
        {
            case "cliente": //Lista Clientes
            for(Cliente cliente : clientes)
                lista += "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCPF() + "\n\n"; //Concatena os clientes
            
            if(lista.isEmpty()) //Caso não haja nenhum cliente cadastrado
                JOptionPane.showMessageDialog(form, "Nenhum cliente cadastrado", "AVISO", JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(form, lista, "Lista de Clientes", 1);

            break;

            case "conta":  //Lista contas
            for(Cliente cliente : clientes)
                lista += "\nNúmero da conta: " + cliente.getConta().getNumero() + "\nSaldo: " + cliente.getConta().getSaldo() + "\n\n";

            if(lista.isEmpty()) //Caso não haja nenhuma conta cadastrada
                JOptionPane.showMessageDialog(form, "Nenhuma conta cadastrada", "AVISO", JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(form, lista, "Lista de Contas", 1);    
            break;
            
            default: //
                break;
        }
            
                
    }
}
