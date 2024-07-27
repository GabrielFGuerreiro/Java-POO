package exercicio12;

public class Consulta_cinemas
{
    public static void main(String[] args)
    {
        Cine_Roxy roxy =  new Cine_Roxy();
        Cine_Caicara caicara = new Cine_Caicara("Antigo cinema da \n" +
        "Av. Conselheiro Nébias - Boqueirão");

        caicara.setLocal("Avenida Conselhiro Nébias com a Praia");
        caicara.setNome("Cinema Caiçara");
        System.out.println("Cine \t" + caicara.getNome() +
        "\nficava na esquina da: \t" + caicara.getLocal());
    }
}