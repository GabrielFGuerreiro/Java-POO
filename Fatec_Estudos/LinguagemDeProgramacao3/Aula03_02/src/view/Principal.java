package view;

import business.Figura;
import business.Quadrado;

public class Principal
{
    public static void main(String[] args)
    {
        Quadrado objQuadrado1 = new Quadrado();
        objQuadrado1.setLado(5);

        Figura objQuadradoUp = objQuadrado1; //Upcasting (obj. classe filha --> obj. classe pai)
        System.out.println(
            String.format("(Upcasting) Área da figura %.2f cm².",
            objQuadradoUp.calculaArea()));

        Figura ObjQuadrado2 = new Quadrado();
        
        Quadrado objQuadradoDown = (Quadrado)ObjQuadrado2;  //Downcasting (obj. classe pai --> obj. classe filha)
        objQuadradoDown.setLado(7);
        System.out.println(
            String.format("(Downcasting) Área da figura %.2f cm².",
            objQuadradoDown.calculaArea()));

        
    }
}
