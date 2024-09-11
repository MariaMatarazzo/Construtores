package Construtores_11_09;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Animal = new Animal();
		System.out.println("1");
		System.out.println(Animal.gettamanho());
		System.out.println(Animal.getcor());

		//***********Construtor sem argumento*********

		Animal Animal2 = new Animal();
		System.out.println("2");
		Animal2.settamanho("GRANDE");
		Animal2.setCor("marrom");
		System.out.println(Animal2.gettamanho());
		System.out.println(Animal2.getcor());


		//**********Construtor com 1 argumento*************
		System.out.println("3");
		Animal  Animal3= new Animal();
		Animal3.settamanho("GRANDE");
		Animal3.setCor("marrom");
		System.out.println(Animal3.gettamanho());
		System.out.println(Animal3.getcor());


		//**********Construtor com 1 argumento*************
		Animal Animal4  = new Animal();
		System.out.println("4");
		Animal4.settamanho("GRANDE");
		Animal4.setCor("marrom");
		System.out.println( Animal4.gettamanho());
		System.out.println( Animal4.getcor());




	}

}
