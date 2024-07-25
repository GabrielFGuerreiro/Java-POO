package exemplo10;

public class Cidade_de_Santos
{
    private String regiao;
    private int populacao;
    
    Cidade_de_Santos() {} //4.1
    Cidade_de_Santos(String s) //1.3  ||  2.3  ||  3.2
    {
        if(s=="r")
            System.out.println("Secretaria de Regionais");
        if(s=="b")
            System.out.println("Secretaria de Bairros");
         if(s=="l")
            System.out.println("Secretaria de Logradouros");
    }

    public void setRegiao(String regiao) {this.regiao=regiao;}
    public String getRegiao() {return regiao;}

    public void setPopulacao(int populacao) {this.populacao=populacao;}
    public int getPopulacao() {return populacao;}
}