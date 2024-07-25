 
public class Infos_pada
{
    public static void main(String[] args)
    {
        Padaria padoca = new Padaria(25);

        padoca.setValorpao(2);
        padoca.setNome("Padaria 01");
        padoca.setValorcafe(3.5f);

        System.out.println("O nome da padaria é: "+padoca.getNome()+"\nO valor do pão é: "+padoca.getValorpao()+
        "\nO valor do café é: "+padoca.getValorcafe()+"\nQuantidade de pães: "+padoca.getNumpao()); 
        //numpao= não há set, apenas constr. e get (nao seria possivel alterar depois)

    }
}