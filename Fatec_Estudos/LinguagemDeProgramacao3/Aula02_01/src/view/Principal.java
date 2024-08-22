package view;

class Data
{
    private int dia, mes, ano;

    public int getDia() {return dia;}

    public void setDia(int dia)
    {
        if(dia > 0 && dia < 32)
            this.dia = dia;
    }

    public int getMes() {return mes;}

    public void setMes(int mes)
    {
        if(mes > 0 && mes < 13)
            this.mes = mes;
    }

    public int getAno() {return ano;}

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public Data() {this.dia = this.mes = this.ano = 0;}

    public Data (int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String retornaInfo() {return String.format("Data: %d/%d/%d", dia, mes, ano);}
}


public class Principal
{
    public static void main(String[] args)
    {
        Data dataHoje = new Data();
        dataHoje.setDia(15);    dataHoje.setMes(8);    dataHoje.setAno(2024);

        Data dataAmanha = new Data(16, 8, 2024);

        System.out.println(dataHoje.retornaInfo());
        System.out.println(dataAmanha.retornaInfo());
    }
}