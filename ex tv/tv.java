package exerc1;

public class tv {
	
	String cor;
	int tamanho;
	boolean ligada;
	String marca;
	
	
	
	void ligada(){
		this.ligada = true;
	}
	
	void desligada() {
		this.ligada = false;
	}
	
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Está ligada? " + this.ligada);
	}
}
