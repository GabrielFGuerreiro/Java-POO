

public class Carro
{
    //atributos
    String nome;
    String marca;
    int ano;
    int vel;

    //métodos. As variáveis "aceleracao" e "reduzir" vão RECEBER valores
    void acelerar(int aceleracao)
    {
        vel+=aceleracao;
    }

    void freiar(int reduzir)
    {
        vel-=reduzir;
    }

    void buzinar()
    {
      System.out.println("BI BI BI");    
    }
}