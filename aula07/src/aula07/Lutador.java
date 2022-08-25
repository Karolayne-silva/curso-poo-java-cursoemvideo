package aula07;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empate;
	
	//metodos
	
	public void apresentar() {
		System.out.println("-------------------------------");
		System.out.println("nome: " + this.getNome());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Nacionalidade: "+ this.getNacionalidade());
		System.out.println("Altura: "+ this.getAltura());
		System.out.println("Peso: "+ this.getPeso());
		System.out.println("Numero de vitorias: " + this.getVitorias());
		System.out.println("Numero de derrotas: " + this.getDerrotas());
		System.out.println("Numero de empate: " + this.getEmpate());
		
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.print("é um peso " + this.getCategoria());
		System.out.print(" ,Vitorias: " + this.getVitorias());
		System.out.print(" ,Derrotas: " + this.getDerrotas());
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpate(this.getEmpate() + 1);
	}
	
	//metodos especiais
	
	public Lutador(String nome, String nac, int i, float p, float a, int v, int d, int e) {
		this.setNome(nome);
		this.setNacionalidade(nac);
		this.setIdade(i);
		this.setPeso(p);
		this.setAltura(a);
		this.setVitorias(v);
		this.setDerrotas(d);
		this.setEmpate(e);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public float getAltura() {
		return this.altura;
	}
	public float getPeso() {
		return this.peso;
	}
	public String getCategoria() {
		return this.categoria;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public int getEmpate() {
		return this.empate;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNacionalidade(String nac) {
		this.nacionalidade = nac;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public void setAltura(float a) {
		this.altura = a;
	}
	public void setPeso(float p) {
		this.peso = p;
		this.setCategoria();
	}
	private void setCategoria() {
		
		if(this.getPeso() < 52.2) {
			this.categoria = "inválida";
		}
		else if(this.getPeso()<= 70.3) {
			this.categoria = "leve";
		}
		else if(this.getPeso()<=83.9) {
			this.categoria = "médio";
		}
		else if(this.getPeso()<= 120.2) {
			this.categoria = "pesado";
		}
		else {
			this.categoria = "inválido";
		}
	}
	
	public void setVitorias(int v) {
		this.vitorias = v;
	}
	public void setDerrotas(int d) {
		this.derrotas = d;
	}
	public void setEmpate(int e) {
		this.empate = e;
	}
	
}
