package view;

import business.Cachorro;
import business.Gato;

public class Principal {

	public static void main(String[] args) {

		Gato gato1 = new Gato("Lucky");
		gato1.setIdade(5);
		gato1.setPeso(5.6f);
		System.out.println(gato1.brincar());
		System.out.println(gato1.miar());
		System.out.println(gato1);
		
		Cachorro cao1 = new Cachorro("Thor");
		cao1.setIdade(3);
		cao1.setPeso(18);
		System.out.println(cao1.brincar());
		System.out.println(cao1.latir());
		System.out.println(cao1);
		
		Gato gato2 = new Gato("Tom");
		gato2.setIdade(7);
		gato2.setPeso(4f);
		System.out.println(gato2.brincar());
		System.out.println(gato2.miar());
		System.out.println(gato2);
		
		Cachorro cao2 = new Cachorro("Hulk");
		cao2.setIdade(8);
		cao2.setPeso(37);
		System.out.println(cao2.brincar());
		System.out.println(cao2.latir());
		System.out.println(cao2);
	}
}
