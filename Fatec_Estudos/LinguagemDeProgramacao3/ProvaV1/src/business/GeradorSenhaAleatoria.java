package business;

import java.util.Random;
import javax.swing.JOptionPane;

public class GeradorSenhaAleatoria implements IGeradorSenha
{
    private int comprimento;
    private boolean temMaiuscula, temMinuscula, temNumero, temEspeciais;

    public GeradorSenhaAleatoria(int comprimento, boolean temMaiuscula, boolean temMinuscula, boolean temNumero, boolean temEspeciais)
    {
        this.comprimento = comprimento;
        this.temMaiuscula = temMaiuscula;
        this.temMinuscula = temMinuscula;
        this.temNumero = temNumero;
        this.temEspeciais = temEspeciais;
        gerarSenha();
    }
    
    @Override
    public void gerarSenha()
    {
        String caracteres = "";
            
        //Definindo os caracteres permitidos
        if (temMaiuscula)
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (temMinuscula)
            caracteres += "abcdefghijklmnopqrstuvwxyz";

        if (temNumero)
            caracteres += "0123456789";

        if (temEspeciais)
            caracteres += "!@#$%^&*()";

        //Verifica se pelo menos um tipo de caractere foi selecionado
        if (caracteres.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Pelo menos um tipo de caractere deve ser selecionado.", "ERRO", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Random random = new Random();
        StringBuilder senha = new StringBuilder(comprimento);
        
        //Cria a senha aleatória
        for (int i = 0; i < comprimento; i++)
        {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }
        JOptionPane.showMessageDialog(null, senha, "Senha aleatória", 1);
    }
}