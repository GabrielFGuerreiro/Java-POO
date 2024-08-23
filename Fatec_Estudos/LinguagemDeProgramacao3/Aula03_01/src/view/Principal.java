package view;

import javax.swing.JOptionPane;

import business.Adicao;
import business.Calculo;
import business.Subtracao;
import business.Multiplicacao;
import business.Divisao;


public class Principal
{
    public static void main(String[] args)
    {
        String op = "";

        //Validação para que o input do user nao seja diferente de 1, 2, 3 ou 4
        while (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4"))
        {
            op = JOptionPane.showInputDialog("Digite a operação que deseja realizar!\n"
            + "1.Adição\n2.Subtração\n3.Multiplicação\n4.Divisão");

            if (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4"))
            {
                JOptionPane.showMessageDialog(null, "Valor inválido.", "ERRO", 0);
            }
        }
      
        /*Usando polimorfismo para reduzir a repetição de código:
        /Ao invés de instanciar cada classe separadamente, uma variável do tipo Calculo
        foi declarada e instanciada de acordo com a operação selecionada*/
        Calculo conta = null;

        switch (op)
        {
            case "1":
                conta = new Adicao();         //Instancia o objeto na classe Adicao
                break;
            
            case "2":
                conta = new Subtracao();      //Instancia o objeto na classe Subtracao
                break;
        
            case "3":
                conta = new Multiplicacao();  //Instancia o objeto na classe Multiplicacao
                break;

            case "4":
                conta = new Divisao();        //Instancia o objeto na classe Divisao
                break;
        
            default:
                break;
        } 

        //Garantir que a variável "conta" foi corretamente instanciada antes de tentar acessar seus método
        if (conta !=  null)
        {
            //Mais uso do polimorfismo
            conta.setValor1((Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 1:"))));  //Levando o valor 1
            conta.setValor2((Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 2:"))));  //Levando o valor 2
            conta.calcular();     //Chamando o método calcular da classe selecionada
            String mensagem = "Os valores " + conta.getValor1() + " e " + conta.getValor2() +
            " foram usados na conta, dando o resultado: " + conta.getResultado();
            JOptionPane.showMessageDialog(null, mensagem, "Resposta!", 1);  //Pritando na tela a conclusão
        }       
    }
}