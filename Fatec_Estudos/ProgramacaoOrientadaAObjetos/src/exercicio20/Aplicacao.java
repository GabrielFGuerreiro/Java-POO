package exercicio20;

public class Aplicacao
{
    public static void main (String[] args)
    {
        Classe_abstrata a = new Classe_filha();

        a.setMensagem("Demonstrando Classe Abstrata");
        a.mostra_mensagem();
    }
}
