package Abstrata;

abstract class Atividade
{
     private String nome;
     private int duracao;

     public Atividade(String nome,int duracao)
     {
          this.nome=nome;
          this.duracao=duracao;
     }    

     public String getNome() {return nome;}
     public int getDuracao() {return duracao;}

     public abstract void FazerAtividade();

     public String mostra()
     {
          return "Atividade: " + nome + ", Duração: " + duracao + " minutos";
     }
}