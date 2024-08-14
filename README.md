# Sobre
Este repositório contém os materiais dos meus estudos nas aulas de Java, realizados na Fatec Baixada Santista - Rubens Lara. Nesse repositório terá anotações, exercícios e projetos relacionados aos tópicos abordados.

# Conceitos estudados
- **Conceitos Java**: Aprendendo sobre a estrutura e sintaxe da linguagem de programação java a partir de inúmeros programas desenvolvidos em aula.
- **Conceitos de POO**: Entendendo os tópicos mais essenciais sobre programação orientada a objetos como abstração, herança, polimorfismo, sobrecarga, entre outros.

# Estudos/anotações

## Abstração
Análise de uma situação do mundo real, decompondo-a nas partes mais fundamentais para ser descrita em linguagem simples e precisa (atribuir nomes e descrever funcionalidades).  

## Classes
Abstração de objetos/entidades com características e comportamentos similares entre si.
Servem como **"modelos"** para criar objetos, definindo a estrutra e o comportamento que os objetos compartilharão.
Para isso, dispõe de atributos e métodos.
    
## Atributos
São declarações das classes (variáveis) que representam **características** de instância do objeto.  
int dia;        <-- variável de classe  
data.dia = 05;  <-- variável de instância  

## Métodos
São declarações das classes que representam **ações** que a mesma pode executar em função dos valores de seus atributos.  

## Objetos e instâncias
Objeto é uma entidade que pode ser física, conceitual ou de software. Ou seja, uma representação genérica.  
Instância é usada com o sentido de "exemplo". É a concretização da classe, são as entidades de fato criadas a partir de uma classe e ocupando espaço na memória.  
Ex: pode haver a classe cachorro que da origem a 3 objetos cachorros, de forma genérica. A instância da classe, iria criar o "Totó","Rex" e "Bidu".  

|classe| |variável| = |new| |classe()|;   <-- instânciação de um obj.

Ex1: PlanoDeEnsino plano1 = new PlanoDeEnsino();  

1. O 1º"PlanoDeEnsino" é o tipo da variável. Aqui declaramos que "plano1" é uma variável que pode armazenar uma referência a um objeto do tipo "PlanoDeEnsino";  
2. A variável "plano1" recebe o endereço do objeto;
3."new" é o operador responsável por instanciar a classe. Ele aloca memória e ocupa fisicamente um endereço para criar efetivamente um novo objeto;  
4.O 2º "PlanoDeEnsino" é a chamada ao construtor da classe. Esse construtor é o que cria o objeto propriamente dito, utilizando a memória alocada pelo operador "new".

Ex2: Classe_pai classe = new Classe_filha();  
Se a Classe filha herda da Classe pai, então há como declarar um objeto de subclasse usando uma referência de superclasse, mas não o contrário.

## Método construtor
É um método especial chamado automaticamente quando o objeto é instanciado/criado.
Ele é usado para inicializar os atributos da classe com valores. Ele deve possuir o mesmo nome da classe. Além disso, não retorna nenhum tipo de valor, e sim a intância do objeto (endereço da memória).  

## Encapsulamento
É a forma como as CLASSES, MÉTODOs ou VARIÁVEIS podem ser vistos e utilizados por outras classes (e seus métodos/variáveis). Serve para proteger a integridade dos dados de uma classe, controlando o acesso a eles.  
Utiliza-se os modificadores de acesso:
- public: acessível para todas as outras classes e pacotes do projeto;  
- protected: acessível para as classes do mesmo pacote e subclasses, mesmo que estejam em pacotes diferentes;  
- private: acessível apenas para a classe em que este atributo se encontra;  
- package-private: é o modificador padrão quando outro não é definido. Similar ao protected, porém não deixa acessível fora do pacote, nem por subclasses;  
- final: modificador que, aplicado a uma variável, a torna uma constante; aplicado a um método, impede que ele seja sobrescrito; aplicado a uma classe, impede que ela seja estendida;  
- static: esse membro é compartilhado entre todas as instâncias da classe. Ou seja, você pode acessar o membro static diretamente pela classe, sem precisar criar uma instância. Além disso, um membro (várivel/método) do tipo static vai para memória (é instanciado ) no momento de execução, rodando até o término do programa.  Ex:  

class ClasseEx {  
    static int contador = 0;  
}  

// Acesso ao membro static:  
System.out.println(ClasseEx.contador);  


## Métodos de acesso
Os métodos set e get são usados para manipular os atributos de uma classe PRIVADA de forma controlada. Eles permitem definir (set) e obter (get) os valores desses atributos.
### Set
O método set é utilizado para alterar os valores dos atributos de um objeto APÓS a criação, a qualquer momento DURANTE a execução.
Ele recebe um valor como argumento e atribui a um atributo da classe.  
Exemplo: public void setNome(String nome) { this.nome = nome; }.
### Get
É usado para acessar o valor de um atributo privado de uma classe. Esse método não recebe nenhum parâmetro e apenas retorna o valor atual do atributo.  
Exemplo: public void getNome() { return = nome; }.

## Herança
Esse conceito permite que uma classe (classe filha ou subclasse) herde (compartilhe) os atributos e métodos não privadods de outra classe (classe pai ou superclasse).
- As classes situadas na hierarquia inferior da herança herdam atributos e métodos das classes acima.
- Método super():acessa o método construtor da classe que está imediatamente acima na hierarquia da Herança.

## Polimorfismo
O Polimorfismo (poli = muitas, morphos = formas), ou sobrescrita, é o conceito no qual subclasses de uma mesma superclasse implemantam comportamentos específicos de um método que já está sendo usado pela classe pai.  
Cada um desses métodos derivados têm a mesma identificação (assinatura/nome), mas funcionamentos diferentes, e usam como referência o tipo do método da superclasse.  
Isso permite que objetos de diferentes classes respondam de maneira diferente a uma mesma CHAMADA de método.  
Em outras palavras, um mesmo método pode apresentar várias formas, de acordo com seu contexto; é a modificação do comportamento de um método existente da classe modelo.  

O polimorfismo torna o código mais flexível, modular e fácil de entender e dar manutenção, pois permite que o comportamento dos objetos seja determinado em tempo de execução, dependendo do tipo do objeto.
Isso promove a reutilização de código e a abstração, que são princípios fundamentais na programação orientada a objetos.  

public class Animal  
{    
    public void fazerSom() { System.out.println("Som genérico de animal."); }  
}  
    
public class Cachorro extends Animal  
{    
    //Override  
    public void fazerSom() { System.out.println("Au au!"); }  
}  
    
public class Gato extends Animal  
{  
    //Override  
    public void fazerSom() { System.out.println("Miau!"); }  
}  
    
public class Main  
{  
    public static void main(String[] args)  
    {  
        Animal animal1 = new Cachorro();  
        Animal animal2 = new Gato();   
            
        animal1.fazerSom(); //"Au au!"   
        animal2.fazerSom(); //"Miau!"  
    }  
}  

## Bibliotecas AWT e Swing<
AWT (Abstract Window Toolkit) é uma biblioteca gráfica em Java que fornece classes e métodos para criar interfaces gráficas de usuário (GUI), como  como janelas, botões, caixas de texto, menus, etc, em aplicativos Java. Como limitação, ela pode ter uma aparência e comportamento diferentes em diferentes sistemas operacionais.  
Outras bibliotecas gráficas, como Swing e JavaFX, foram construídas em cima da AWT, estendendo suas funcionalidades e superando algumas de suas limitações.
A biblioteca swing fornece um conjunto mais avançado de componentes de interface gráfica de usuário (GUI) em comparação com o pacote java.awt. Ele fornece componentes gráficos mais avançados e flexíveis, barras de rolagem, tabelas, painéis, entre outros. Além disso, ele oferece suporte a recursos adicionais, como layout gerenciado pelo sistema, suporte a ícones, diálogos modais, entre outros.

## Sobrecarga
A sobrecarga (overloading) em Java é uma característica que permite a criação de vários métodos com o mesmo nome, mas com diferentes listas de parâmetros (assinaturas). Isso significa que você pode definir várias versões de um método na mesma classe (ou em uma classe que a herda), desde que cada versão tenha um conjunto distinto de parâmetros (com base na quantidade, nos tipos e na ordem de parâmetros). Neste exemplo, o método soma é sobrecarregado três vezes com diferentes assinaturas:  
    
public class Calculadora {  
    // Método para somar dois inteiros  
    public int soma(int a, int b) { return a + b; }  

    // Método para somar três inteiros  
    public int soma(int a, int b, int c) { return a + b + c; }  

    // Método para somar dois números de ponto flutuante  
    public double soma(double a, double b) { return a + b; }  
}  

## Classe abstrata
Uma classe abstrata não pode ser instanciada (criação de um objeto) diretamente e é utilizada como uma classe-base (modelo) para outras classes. Ela pode conter métodos abstratos, que são métodos declarados sem implementação (sem corpo). Esses métodos precisam, obrigatoriamente, ser implementados pelas classes que herdam a classe abstrata. Além disso, uma classe abstrata pode conter métodos concretos, que possuem implementação, bem como variáveis e construtores.

## Interface
Na orientação a objetos uma interface é uma referência que determina uma série de requisitos que uma classe deva conter. As classes que implementam uma interface devem, obrigatoriamente, fornecer implementações para todos os métodos da interface. Uma interface é similar a uma classe abstrata, porém não permite a implementação de métodos, contendo apenas a especificação destes. 