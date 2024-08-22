package exercicio17;

public class Destrutor_main	
{
	public static void main(String args[])
	{
		Destrutor i=new Destrutor("Volksvagen", "Fusca", "verde", 6867.99);
		System.out.println(i.mostra());
		
		i=null;
		System.gc();
		System.out.println(i.mostra());	
	}
}