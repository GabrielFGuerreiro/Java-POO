package exemplo14;

public class PessoaJuridica extends Contribuinte
{
    private String cnpj;

    public void setCNPJ(String cnpj) {this.cnpj = cnpj;}
    public String getCNPJ() {return cnpj;}

    public void mostraclasse()
    {
        System.out.println("Classe Pessoa Jurídica");
    }
}