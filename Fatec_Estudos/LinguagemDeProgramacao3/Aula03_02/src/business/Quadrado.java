package business;

public class Quadrado extends Figura
{
    private int lado;

    public void setLado(int lado) {this.lado = lado;}

    @Override
    public float calculaArea()
    {
        return lado * lado;
    }
}
