package exercicio16;

public class CalculaAreas
{
    public static void main(String[] args)
    {
        Figuras_geometricas u = new Figuras_geometricas();

        System.out.println("Área do retângulo "+u.getArea(u.getLado_a(),u.getLado_b()));
        System.out.println("Área do quadrado "+u.getArea());
        u.setLado_a(4.0);
        System.out.println("Área do retângulo "+u.getArea(u.getLado_a(),u.getLado_b()));
        System.out.println("Área do quadrado "+u.getArea());
    }
}
