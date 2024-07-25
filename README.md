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
Servem como "modelos" para criar objetos, definindo a estrutra e o comportamento que os objetos compartilharão.
Para isso, dispõe de atributos e métodos.

## Objetos
Objeto é uma entidade que pode ser física, conceitual ou de software. Ou seja, uma representação genérica.  
instância é usada com o sentido de "exemplo". É a concretização da classe, são os objetos de fato criados a partir de uma classe e ocupando espaço na memória.  
Ex: pode haver a classe cachorro, dando origem ao(s) objeto(s) cachorro(s), de forma genérica. A instância da classe, iria criar o "Totó","Rex" e "Bidu".
    
## Atributos
São as características (variáveis) do objeto.

## Métodos
São as ações que o objeto pode realizar.

## Método construtor
É um método especial responsável por criar o objeto da classe (instanciando a classe que foi definida), sendo chamado automaticamente quando o objeto é instanciado/criado.
Ele é usado para inicializar os atributos da classe com valores específicos no momento da criação do objeto.  
Um método construtor pode receber parâmetros e atribuir esses valores diretamente aos atributos da classe.  
Exemplo:  
public Padaria(String nome, String localizacao, int numeroFuncionarios)  
{ ... }.
    
## Encapsulamento
É a forma como os elementos da classe podem ser vistos e utilizados por outras classes. Serve para proteger a integridade dos dados de uma classe, controlando o acesso a esses dados.  
Utiliza-se os modificadores de acesso:
- public: deixará a classe/membro visível para todas as outras classes e pacotes do projeto;  
- protected: deixará a classe/membro visível apenas para as classes do mesmo pacote;
- private: deixará o atributo visível apenas para a classe em que este atributo se encontra;  
- package-private: é o modificador padrão quando outro não é definido. Similar ao protected.

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
Esse conceito permite que uma classe (conhecida como classe filha/subclasse) herde (compartilhe) os atributos e métodos de outra classe (classe pai/superclasse).
- As classes situadas na hierarquia inferior da herança herdam atributos e métodos das classes acima.
- Método super():acessa o método construtor da classe que está imediatamente acima na hierarquia da Herança.