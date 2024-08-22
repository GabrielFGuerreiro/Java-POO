package exercicio14;

public class Funcionario extends PessoaFisica
{
    private String cartao;

    public void setCartao(String cartao) {this.cartao = cartao;}
    public String getCartao() {return cartao;}

    public void mostraclasse()
    {
        System.out.println("Classe Funcionário");
    }
}
