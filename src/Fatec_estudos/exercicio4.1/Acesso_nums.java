 
public class Acesso_nums
{
	
int a; //package-private: só esse pacote
public int b; //geral
private int c; //só essa classe
protected int d;  //só esse pacote

	public void setnumero(String id, int numero)
	{
		if(id=="a")
			this.a=numero;
		
		if(id=="c")
			this.c=numero;
		
		if(id=="d")
			this.d=numero;
	}
	
    //não precisa retornar o valor de c com o get pq o print é nessa classe e não na classe main.
	public void mostra_numero()
	{
		System.out.println("numero a = " +a);
		System.out.println("numero b = " +b);
		System.out.println("numero c = " +c);
		System.out.println("numero d = " +d);
	}
}
