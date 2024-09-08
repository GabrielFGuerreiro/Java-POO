package business;

public class Avaliacao implements IMedia, IPresenca
{
    private float mediaFinal = 0, percentualPresenca = 0;    

    public void calcularMedia(float p1, float p2, float p3)
    {
        mediaFinal = (p1 + p2 + p3) / 3;
    }

    public void calcularPercentualPresenca(int totalAulas, int qtdePresencas)
    {
        percentualPresenca = ((float) qtdePresencas / totalAulas) * 100;
        /*Em Java, a divisão de dois inteiros resulta em um inteiro.
        O casting para (float) força a divisão a ser feita como uma divisão de ponto flutuante,
        preservando a parte decimal do resultado.*/
    }

    public String informaResultado()
    {
        if(mediaFinal >= 6 && percentualPresenca >= 75)
            return String.format(
            "Com a nota de %.2f e a presença de %.0f%%, você esta aprovado!", 
            mediaFinal, percentualPresenca);
        else 
            return String.format(
            "Com a nota de %.2f e a presença de %.0f%%, você esta reprovado",
            mediaFinal, percentualPresenca);
    }
}
