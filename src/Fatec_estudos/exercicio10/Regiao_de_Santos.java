package exemplo10;

public class Regiao_de_Santos extends Cidade_de_Santos
{
    Regiao_de_Santos() {super("r");}//3.1
    Regiao_de_Santos(String f) {super(f);} //1.2 | 2.2

    private String bairro;

    public void setBairro(String bairro) {this.bairro=bairro;}
    public String getBairro() {return bairro;}
}