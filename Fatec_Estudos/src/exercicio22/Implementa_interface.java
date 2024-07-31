package exercicio22;

public class Implementa_interface implements Classe_interface
{
    protected String fruta_vermelha;
    protected String fruta_citrica;
    
    public String identifica_fruta(String fruta) {return fruta;}

    public int quantidade_frutas(int f) {return f;}

    public double preco_kilo(double k) {return k;}
}
