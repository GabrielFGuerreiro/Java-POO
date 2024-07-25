/* Criar o objeto “Plano de Ensino” com os atributos: matéria,
conteúdo programático, critério de avaliação e bibliografia;
2. Criar a versão padrão do método construtor;
3. Criar uma versão do método construtor onde os atributos possam ser inicializados com valores;
4. Criar os respectivos métodos sets( ) e gets( ) para cada atributo;
5. Criar aplicação executável (classe main) e criar variáveis de instância para
inserir os valores dos atributos através do método construtor e pelos métodos sets( );
6. Retornar os valores inseridos pelos métodos gets( ), mostrando-os no console */


public class Plano_de_ensino
{
    private String mat,cont,ava,bibli;

    //1.1. Recebe os valores padrões
    Plano_de_ensino(){}

    //construtor=set's
    //2.1. Recebendo os valores do plano 2 pelos parâmetros E atribuindo as vars
    Plano_de_ensino(String mat, String cont, String ava, String bibli)
    {
        this.mat=mat;
        this.cont=cont;
        this.ava=ava;
        this.bibli=bibli;
    }

    //1.3. Recebendo os valores do plano 1 pelos parâmetros E atribuindo as vars
    public void setMat(String mat) {this.mat=mat;}
    public void setCont(String cont) {this.cont=cont;}
    public void setAva(String ava) {this.ava=ava;}
    public void setBibli(String bibli) {this.bibli=bibli;}

    //1.4. Retornando os valores das variáveis do plano 1
    //2.2. Retornando os valores das variáveis do plano 2
    public String getMat() {return mat;}
    public String getCont() {return cont;}
    public String getAva() {return ava;}
    public String getBibli() {return bibli;}
}

