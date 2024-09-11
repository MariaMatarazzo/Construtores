package Construtores_11_09;

public class Animal {

	private String tamanho;
	private String cor;

	public void Animal() {

	}
	//**********	Construtor 1 ***************//
	public Animal() {
		this.tamanho= tamanho;
	}

	//***********Construtor 2***************//

	public Animal(String tamanho,String cor) {
		this.tamanho= tamanho;
		this.cor=cor;
	}

	///**************Construtor 3********//	
	public void Animal(String tamanho) {
		this.tamanho= tamanho;
	}


	public String gettamanho() {
		return tamanho;
	}
	public void settamanho(String string) {
		this.tamanho = string;
	}
	public String getcor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setCor(int i) {
		// TODO Auto-generated method stub
		
	}

}

