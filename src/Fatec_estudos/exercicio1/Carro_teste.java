

public class Carro_teste
{
  public static void main(String[] args)
  {
    /*
    -Carro é uma classe, nesse caso é um "tipo classe" de uma variável;
    -c1 é uma variável de instância (ou objeto) da classe Carro. Ela é do tipo "Carro";
    -new é usado para criar uma nova instância (ou objeto) de uma classe;
    -Carro() é o construtor da classe Carro;
    -Portanto, a expressão cria uma nova variável c1 do tipo Carro e
    atribui a ela uma nova instância da classe Carro, utilizando o construtor padrão.
    Isso resulta na criação de um novo objeto Carro, que pode ser manipulado e acessado por meio da variável c1.*/
    Carro c1 = new Carro();

    c1.nome = "Uno";
    c1.marca = "Fiat";
    c1.ano = 2015;
    c1.vel = 60;

    //retornando o valor 10 para a variável aceleracao
    c1.acelerar(10);
    System.out.println("A velocidade atual é: "+c1.vel + "km/h");
    
    //retornando o valor 30 para a variável reduzir

    c1.freiar(30);
    System.out.println("A velocidade atual é: "+c1.vel + "km/h");

  }
}
