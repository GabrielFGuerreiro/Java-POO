package exemplo4_1;

public class Verifica_encapsulamento
{
		public static void main(String[] args)
		{
			Acesso_nums chave=new Acesso_nums();
			
			chave.a=10;
			chave.b=20;
			//chave.c=30 N é possível acessar var private diretamente
			chave.setnumero("c",30);
			chave.d=40;
			//chamando o método que printa os valores
			chave.mostra_numero();
		}
}
