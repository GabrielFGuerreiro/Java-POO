package business;

public class Conta
{
    private int numero, saldo;
    
    public Conta(int numero, int saldo)
    {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero() {return numero;}
    public int getSaldo() {return saldo;}

    public void setNumero(int numero) {this.numero = numero;}
    public void setSaldo(int saldo) {this.saldo = saldo;}
}
