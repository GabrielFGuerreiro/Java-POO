package exercicio20;

public abstract class Classe_abstrata
{
    private String mensagem;

    protected void setMensagem(String mensagem) {this.mensagem = mensagem;}
    protected String getMensagem() {return mensagem;}

    protected abstract void mostra_mensagem();
}