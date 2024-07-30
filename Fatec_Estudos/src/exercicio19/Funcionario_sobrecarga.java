package exercicio19;

import javax.swing.JOptionPane;

public class Funcionario_sobrecarga
{
    public static void main(String[] args)
    {
        Ficha_funcionario funcionarios = new Ficha_funcionario("Gisele","Pedagoga",22,2889.00);
        JOptionPane.showMessageDialog(null, funcionarios.mostra_funcionarios());

        concatena_aplicacao();
    }
    public static void concatena_aplicacao()
    {
        Acesso_secundario a = new Acesso_secundario();
    }
}
