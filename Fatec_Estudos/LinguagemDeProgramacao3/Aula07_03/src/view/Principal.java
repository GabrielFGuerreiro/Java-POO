package view;

import business.Horario;

public class Principal
{
    public static void main(String[] args)
    {

        //1.Instância de horario, levando valores como parâmetros
        Horario horario = new Horario(10, 30);
        new Formulario(horario);

        //Usa o objeto horario para acessar os métodos de retorno, utilizndo as variáveis
        //Hora hora e Minuto minuto e, assim, tendo acesso aos valores das unidades.
        // System.out.println(horario.getHora().getUnidade());
        // System.out.println(horario.getMinuto().getUnidade());
        // horario.getHora().incrementaUnidade(1);
        // horario.getMinuto().decrementaUnidade(1);
        
    }
}
