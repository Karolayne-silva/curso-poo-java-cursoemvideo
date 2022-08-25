package aula09;

public class Livro implements Publicação {

	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//metodos
	
	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.leitor = leitor;
		this.setAberto(false);
		this.setPagAtual(0);
	}
	
	
	public void detalhes() {
		System.out.println("Titulo: "+ this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de paginas: "+ this.getTotalPag());
		System.out.println("Está aberto?"+ this.getAberto());
		System.out.println("Página atual: "+ this.getPagAtual());
		System.out.println("Dono do livro: " + leitor.getNome());
		System.out.println("Idade do dono: " + leitor.getIdade());
		
	}
	
	//metodos especiais
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	public int getPagAtual() {
		
		if(getAberto() == true) {
			return pagAtual;
		}
		else {
			return pagAtual = 0;
		}
		
	}
		

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
	//metodos abstratos

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	

	@Override
	public void fechar() {
		this.setAberto(false);
		
	}

	
	public void folhear(int p) {
		if(getAberto()) {
			
			this.pagAtual = p;
		}
		
	}

	@Override
	public void avancarPag() {
		
		if(getAberto()) {
			this.setPagAtual(getPagAtual() + 1);
		}
		
	}

	@Override
	public void voltarPag() {
		if(getAberto()) {
			this.setPagAtual(getPagAtual() - 1);
		}
		
	}
}
