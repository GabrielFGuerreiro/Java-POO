/*Escrever código que represente a abstração de uma padaria, com 3 atributos pertinentes e
os método(s) set e get para inserir e retornar os valores dos atributos.
Considerar um método construtor da abstração padaria de modo que um quarto atributo possa
ter o seu valor inserido neste método construtor. */
 
public class Padaria
{
    private int valorpao;
    private int numpao;
    private String nome;
    private float valorcafe;

    //construtor
    Padaria(int numpao) {this.numpao=numpao;}
    public int getNumpao() {return numpao;}

    //setters e getters
    public void setValorpao(int valorpao) {this.valorpao = valorpao;}
    public int getValorpao() {return valorpao;}

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public void setValorcafe(float valorcafe) {this.valorcafe = valorcafe;}
    public float getValorcafe() {return valorcafe;}
}
