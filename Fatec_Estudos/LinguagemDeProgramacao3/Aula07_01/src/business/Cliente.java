package business;

public class Cliente
{
    private String nome, CPF;
    private Conta conta;

    public Cliente(String nome, String CPF, Conta conta)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.conta = conta;
    }

    public String getNome() {return nome;}
    public String getCPF() {return CPF;}
    public Conta getConta() {return conta;}
}
