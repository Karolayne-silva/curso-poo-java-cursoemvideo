package aula09;


public class Principal {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("karol", 21, 'f');
		l[0] = new Livro("A mulher na janela","kira lins", 200, p[0]);
		
		l[0].abrir();
		l[0].folhear(3);
		l[0].detalhes();
		
	}

}
