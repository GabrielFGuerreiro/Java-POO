package exercicio16;

public class Mostra_areas_exerc
{
    public static void main (String[] args)
    {
        Areas_exerc area = new Areas_exerc();

        System.out.println("Área do quadrado "+area.getArea(area.getA()));
        System.out.println("Área do retângulo "+area.getArea(area.getA(),area.getB()));
        System.out.println("Área do cubo "+area.getArea(area.getA(),area.getB(),area.getC()));
    }
}
