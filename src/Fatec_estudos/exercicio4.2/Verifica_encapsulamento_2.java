package exemplo4_2;

//Importando a classe Acesso_nums do pacote exemplo4_1
import exemplo4_1.Acesso_nums;

public class Verifica_encapsulamento_2
{
	public static void main(String[] args)
	{
		Acesso_nums chave=new Acesso_nums();
		
		//*chamando método setnumero 3 vezes*
		//chave.a=10; ENCAPSULAMENTO package-private não permite acesso de fora do pacote
		chave.setnumero("a",10); 
		chave.b=20;
		//chave.c=30; Não é possível acessar a var private diretamente
		chave.setnumero("c",30); 
		//chave.d=40; Não é possível acessar a var protected diretamente
		chave.setnumero("d",40); 
		
		chave.mostra_numero();			
	}
}
