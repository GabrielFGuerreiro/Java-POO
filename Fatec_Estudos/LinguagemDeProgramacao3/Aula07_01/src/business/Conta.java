package business;

public class Conta
{
    private int numero;
    private float saldo;
    
    public Conta(int numero, float saldo)
    {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero() {return numero;}
    public float getSaldo() {return saldo;}

    public void setNumero(int numero) {this.numero = numero;}
    public void setSaldo(int saldo) {this.saldo = saldo;}

    public float deposito(float valor)
    {
        return saldo = saldo + valor;
    }

    public float saque(float valor)
    {
        return saldo = saldo - valor;
    }
}
