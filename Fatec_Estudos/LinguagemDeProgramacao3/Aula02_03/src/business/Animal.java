package business;

abstract class Animal {
    protected String nome;
    protected double peso;
    protected int idade;

    public String  getNome() {return nome;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {if(peso > 0) this.peso = peso;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {if(idade > 0) this.idade = idade;}

    public Animal(String nome) {this.nome = nome;}
    
    public abstract String brincar();
}
