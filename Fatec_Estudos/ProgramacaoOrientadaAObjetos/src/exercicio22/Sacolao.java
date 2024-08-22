package exercicio22;

public class Sacolao
{
    public static void main(String[] args)
    {
        Implementa_interface a = new Implementa_interface();

        a.fruta_citrica = "Laranja";
        a.fruta_vermelha = "Maça";

        System.out.println("Fruta cítrica: "+a.identifica_fruta(a.fruta_citrica));
        System.out.println("Fruta vermelha: "+a.identifica_fruta(a.fruta_vermelha));
        System.out.println("Quantidade de frutas: "+a.quantidade_frutas(12));
        System.out.println("Preço kilo da fruta: R$ "+a.preco_kilo(5.66));
    }
}
