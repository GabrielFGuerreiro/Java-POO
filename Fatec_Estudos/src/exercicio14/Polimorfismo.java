package exercicio14;

import javax.swing.*;

public class Polimorfismo
{
    public static void main(String[] args)
    {
        /*declaração de objeto do tipo da superclasse inicializado como "vazio" */
        Contribuinte pessoa = null;

        //Leitura de variável que definirá como o objeto será instanciado
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor número entre 1 e 4"));

        //Definição de como o objeto será instanciado
        switch(tipo)
        {
            case 1:
                pessoa = new Contribuinte(); //Instância pela superclasse
                break;
            
            case 2:
                pessoa = new PessoaFisica(); //Instância pela classe PessoaFisica
                break;
                
            case 3:
                pessoa = new PessoaJuridica(); //Instância pela classe PessoaJuridica
                break;
                
            case 4:
                pessoa = new Funcionario(); //Instância pela classe Funcionario
                break;
            
            default:
                System.out.println("Tipo não pertence à família");
                System.exit(0);
        }
        pessoa.mostraclasse();
    }
}
