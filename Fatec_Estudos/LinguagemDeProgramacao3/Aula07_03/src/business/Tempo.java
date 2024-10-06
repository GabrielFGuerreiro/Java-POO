package business;

public abstract class Tempo
{
    private int unidade; //Variável coringa (hora ou minuto)
    
    //7.Atribui o valor recebido da unidade (hora ou minuto)
    public void setUnidade(int u) {this.unidade = u;}
    
    //Retorna o valor da unidade (hora ou minuto)
    public int getUnidade() {return unidade;}

    public void incrementaUnidade(int u) {unidade += u;}
    
    public void decrementaUnidade(int u) {unidade -= u;}
}
