package exercicio10;

public class Bairro_de_Santos extends Regiao_de_Santos
{
    Bairro_de_Santos() {super("b");}//1.1
    
    private String rua;

    public void setRua(String rua) {this.rua=rua;}
    public String getRua() {return rua;}
}