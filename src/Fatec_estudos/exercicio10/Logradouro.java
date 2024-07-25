package exemplo10;

public class Logradouro extends Regiao_de_Santos
{
    private String tipo_logradouro;
    private String local_logradouro;

    Logradouro() {super("l");} //2.1

    public void setTipolog(String tipo_logradouro) {this.tipo_logradouro=tipo_logradouro;}
    public String getTipolog() {return tipo_logradouro;}

    public void setLocallog(String local_logradouro) {this.local_logradouro=local_logradouro;}
    public String getLocallog() {return local_logradouro;}
}
