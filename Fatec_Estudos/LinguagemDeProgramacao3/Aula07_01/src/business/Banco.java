package business;

public class Banco
{
    private int listaDeClientes = 0, listaDeContas = 0;

    public Banco(int listaDeClientes, int listaDeContas)
    {
        this.listaDeClientes = listaDeClientes;
        this.listaDeContas = listaDeContas;
    }

    public int getListaClientes(){return listaDeClientes;}
    public int getListaDeContas() {return listaDeContas;}

    public void setListaDeClientes(int listaDeClientes) {this.listaDeClientes = listaDeClientes;}
    public void setListaDeContas(int listaDeContas) {this.listaDeContas = listaDeContas;}
}
