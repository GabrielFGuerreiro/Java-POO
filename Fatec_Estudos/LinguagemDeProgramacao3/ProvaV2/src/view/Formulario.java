package view;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import business.ValidadorSenhaPersonalizada;

public class Formulario
{
    private JFrame form;
    private JTextField txtComprimento, txtSenha;
    private JLabel lblComprimento, lblSenha, lblVerificacao, lblLetrasMai, lblLetrasMin, lblNumeros, lblCaracteresEspeciais;
    private JButton btnSenha;
    private JCheckBox cbLetrasMai, cbLetrasMin, cbNumeros, cbCaracteresEspeciais;
    private boolean verificaMai = false, verificaMin = false, verificaNum = false, verificaEspeci = false;
    private boolean result;

    public Formulario()
    {
        inicializarComponentes();
    }

    public void inicializarComponentes()
    {
        form = new JFrame("Senha");
        form.setBounds(300, 100, 800, 600);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);

        Container painelDeConteudo = form.getContentPane();

        //Maiusculas
        lblLetrasMai = new JLabel("Letras maiúsculas");
        lblLetrasMai.setBounds(50, 50, 150, 75);
        painelDeConteudo.add(lblLetrasMai);

        cbLetrasMai = new JCheckBox();
        cbLetrasMai.setBounds(170, 75, 20, 20);
        painelDeConteudo.add(cbLetrasMai);

        //Minusculas
        lblLetrasMin = new JLabel("Letras minúsculas");
        lblLetrasMin.setBounds(50, 100, 150, 75);
        painelDeConteudo.add(lblLetrasMin);

        cbLetrasMin = new JCheckBox();
        cbLetrasMin.setBounds(170, 125, 20, 20);
        painelDeConteudo.add(cbLetrasMin);

        //Números
        lblNumeros = new JLabel("Números");
        lblNumeros.setBounds(50, 150, 150, 75);
        painelDeConteudo.add(lblNumeros);

        cbNumeros = new JCheckBox();
        cbNumeros.setBounds(170, 175, 20, 20);
        painelDeConteudo.add(cbNumeros);
       
        //Caracteres especiais
        lblCaracteresEspeciais = new JLabel("Letras especiais");
        lblCaracteresEspeciais.setBounds(50, 200, 150, 75);
        painelDeConteudo.add(lblCaracteresEspeciais);

        cbCaracteresEspeciais = new JCheckBox();
        cbCaracteresEspeciais.setBounds(170, 225, 20, 20);
        painelDeConteudo.add(cbCaracteresEspeciais);
           
        //Comprimento
        lblComprimento = new JLabel("*Comprimento:");
        lblComprimento.setBounds(50, 250, 150, 75);
        painelDeConteudo.add(lblComprimento);

        txtComprimento = new JTextField();
        txtComprimento.setBounds(150, 280, 100, 20);
        painelDeConteudo.add(txtComprimento);

        //Verificação final
        JLabel lblVerificacao = new JLabel("a");
        lblVerificacao.setBounds(300, 375, 150, 75);
        painelDeConteudo.add(lblVerificacao);

        //Senha
        JLabel lblSenha = new JLabel("*Senha:");
        lblSenha.setBounds(50, 300, 150, 75);
        painelDeConteudo.add(lblSenha);

        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(150, 327, 100, 20);
        painelDeConteudo.add(txtSenha);

        btnSenha = new JButton();
        btnSenha.setBounds(250, 327, 20, 20);
        painelDeConteudo.add(btnSenha);
        btnSenha.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {                
                verificaMai = (cbLetrasMai.isSelected()) ? true : false;
                verificaMin = (cbLetrasMin.isSelected()) ? true : false;
                verificaNum = (cbNumeros.isSelected()) ? true : false;
                verificaEspeci = (cbCaracteresEspeciais.isSelected()) ? true : false;
 
                ValidadorSenhaPersonalizada validador =  new ValidadorSenhaPersonalizada(Integer.parseInt(txtComprimento.getText()), verificaMai, verificaMin, verificaNum, verificaEspeci);
                if(!txtComprimento.getText().isEmpty() && !txtSenha.getText().isEmpty())
                    result = validador.validarSenha(txtSenha.getText());
                else
                    JOptionPane.showMessageDialog(form, "Preencha todos os campos obrigatórios", "ERRO", JOptionPane.WARNING_MESSAGE);

                if (result)
                    lblVerificacao.setText("Senha Válida!");
                else
                    lblVerificacao.setText("Senha Inválida!");

            }
        });

        form.setVisible(true);
    }
}