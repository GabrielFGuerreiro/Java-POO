package exercicio16;

public class Areas_exerc
{
    private double a,b,c,area;

    Areas_exerc()
    {
        a=2.0;
        b=4.0;
        c=3.0;
    }

    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}

    public double getArea(double a)
    {
        area=a*a;
        return area;
    }

    public double getArea(double a,double b)
    {
        area=a*b;
        return area;
    }

    public double getArea(double a,double b, double c)
    {
        area=a*b*c;
        return area;
    }
}
