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

### Upcasting
Upcasting ocorre quando você usa uma instância de uma subclasse e a trata como uma instância de sua superclasse. Ou seja, você "sobe" na hierarquia (de subclasse para superclasse), assim, você pode acessar apenas métodos da superclasse.  
Esse processo é feito automaticamente pelo compilador e seguro porque qualquer objeto da subclasse é também um objeto da superclasse.  

class Animal {  
    void fazerSom() {  
        System.out.println("Som de animal");  
    }  
}  

class Cachorro extends Animal {  
    void latir() {  
        System.out.println("Au Au");  
    }  
}  

public class Teste {  
    public static void main(String[] args) {  
        Cachorro cachorro = new Cachorro(); // Instancia um objeto Cachorro  
        Animal animal = cachorro; // Upcasting  
        animal.fazerSom(); // Chama o método da superclasse  
    }  
}  

### Downcasting
Downcasting ocorre quando você converte um objeto de uma superclasse para uma subclasse. Ou seja, você "desce" na hierarquia (de superclasse para subclasse) para acessar métodos e atributos específicos da subclasse.  
Esse processo é explícito e pode falhar se o objeto não for realmente uma instância da subclasse especificada.  

public class Teste {  
    public static void main(String[] args) {  
        Animal animal = new Cachorro(); // Upcasting  
        if (animal instanceof Cachorro) {  
            Cachorro cachorro = (Cachorro) animal; // Downcasting  
            cachorro.latir(); // Chama o método da subclasse  
        }  
    }  
}  

## Polimorfismo
O Polimorfismo (poli = muitas, morphos = formas) permite que um método tenha diferentes implementações dependendo da classe do objeto que o chama. É um conceito geral que engloba tanto a sobrescrita quanto a sobrecarga.  
Em outras palavras, objetos de diferentes classes podem responder de maneira diferente à uma mesma chamada de método.  

O polimorfismo torna o código mais flexível, modular e fácil de entender e manter (manutenção), pois permite que o comportamento dos objetos seja determinado em tempo de execução, com base no tipo do objeto. Isso promove a reutilização de código e a abstração, princípios fundamentais na programação orientada a objetos.  

## Sobrescrita
O Override o conceito pelo qual subclasses fornecem implementações específicas de um método que já existe na superclasse.  
Os métodos sobrescritos na subclasse têm o mesmo nome e assinatura do método na superclasse, mas funcionamentos diferentes. A escolha do método a ser executado é baseada no tipo do objeto em tempo de execução.  

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
            
        animal1.fazerSom(); //"Au au!"  - Determinado em tempo de execução  
        animal2.fazerSom(); //"Miau!"   - Determinado em tempo de execução  
    }  
}  

## Sobrecarga
O Overload em Java é uma característica que permite a criação de vários métodos com o mesmo nome, mas com diferentes listas de parâmetros (assinaturas) dentro da mesma classe. Isso significa que você pode definir várias versões de um método, desde que cada versão tenha um conjunto distinto de parâmetros (quantidade, tipos e ordem dos parâmetros). A escolha do método a ser chamado é feita em tempo de compilação.  

Neste exemplo, o método soma é sobrecarregado três vezes com diferentes assinaturas:  

public class Calculadora {  
    // Método para somar dois inteiros  
    public int soma(int a, int b) { return a + b; }  

    // Método para somar três inteiros  
    public int soma(int a, int b, int c) { return a + b + c; }  

    // Método para somar dois números de ponto flutuante  
    public double soma(double a, double b) { return a + b; }  
}  

public class Main {  
    public static void main(String[] args) {  
        Calculadora calc = new Calculadora();  
        int resultado = calc.soma(2, 3);  // O compilador escolhe soma(int a, int b)  
    }  
}  

## Classe abstrata
Uma classe abstrata não pode ser instanciada  diretamente (criação de um objeto) e é utilizada como uma classe-base (modelo) para outras classes. Ela pode conter métodos abstratos, que são métodos declarados sem implementação (sem corpo). Esses métodos precisam, obrigatoriamente, ser implementados pelas classes que herdam a classe abstrata. Além disso, uma classe abstrata pode conter métodos concretos, que possuem implementação, bem como variáveis e construtores.

## Interface
Na orientação a objetos uma interface é uma referência que determina uma série de requisitos que uma classe deva conter. As classes que implementam uma interface devem, obrigatoriamente, fornecer implementações para todos os métodos da interface. Uma interface é similar a uma classe abstrata, porém não permite a implementação de métodos, contendo apenas a especificação destes. 

## Associação
Associação é uma relação entre duas classes que permite que uma instância de uma classe se comunique com uma instância de outra classe. Esse vínculo possibilita que um objeto acesse métodos e atributos de outro objeto, permitindo a troca de informações e o uso de funcionalidades entre eles.

### Agregação
Um tipo especial de associação que representa um relacionamento "todo/parte". Em uma agregação, as partes (objetos) podem existir independentemente do todo. Por exemplo, uma classe Departamento pode ter vários objetos Funcionario, mas se o Departamento for eliminado, os Funcionario podem continuar a existir.  

package RegraNegocio;  
public class Aula{  
private Alunos _alunos;  
private Materia _materia;  
}  
Nesse exemplos, uma aula pode ocorre sem alunos e os alunos existem, de forma própria, sem a aula.

### Composição
Uma forma mais forte de agregação. Na composição, o "todo" é responsável pela criação e destruição de suas partes, ou seja, se o objeto "todo" for destruído, todos os objetos "parte" também são destruídos. Um exemplo seria uma classe Casa que tem várias Paredes. Se a Casa for destruída, as Paredes também serão.  

package RegraNegocio;  
public class Carro {  
private Chassi _chassi;  
private Motor _motor;  
}  

Nesse exemplos, um carro não pode existir sem um motor e um chassi, e um motor/chassi sozinho não tem utilidade.

## Bibliotecas AWT e Swing
AWT (Abstract Window Toolkit) é uma biblioteca gráfica em Java que fornece classes e métodos para criar interfaces gráficas de usuário (GUI), como  como janelas, botões, caixas de texto, menus, etc, em aplicativos Java. Como limitação, ela pode ter uma aparência e comportamento diferentes em diferentes sistemas operacionais.  
Outras bibliotecas gráficas, como Swing e JavaFX, foram construídas em cima da AWT, estendendo suas funcionalidades e superando algumas de suas limitações.
A biblioteca swing fornece um conjunto mais avançado de componentes de interface gráfica de usuário (GUI) em comparação com o pacote java.awt. Ele fornece componentes gráficos mais avançados e flexíveis, barras de rolagem, tabelas, painéis, entre outros. Além disso, ele oferece suporte a recursos adicionais, como layout gerenciado pelo sistema, suporte a ícones, diálogos modais, entre outros.

