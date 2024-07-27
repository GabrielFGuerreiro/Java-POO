package exercicio14;

public class PessoaFisica extends Contribuinte
{
    private String rg;

    public void setRG(String rg) {this.rg = rg;}
    public String getRG() {return rg;}

    public void mostraclasse()
    {
        System.out.println("Classe Pessoa Física");
    }
}