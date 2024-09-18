package business;

public class Divisao extends Calculo
{
    @Override
    public void calcular()
    {
        if (valor2 != 0)
            resultado = valor1 / valor2;
    }
}
