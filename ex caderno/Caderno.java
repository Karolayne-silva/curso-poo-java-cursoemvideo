package aprendendo;

public class Caderno {
	private String marca;
	private String cor;
	private String tipo;
	private boolean fecha;
	
	public Caderno(String m, String c) {
		this.setMarca(m);
		this.setCor(c);
		this.fechado();
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void fechado() {
		this.fecha = true;
	}
	
	public void aberto() {
		this.fecha = false;
	}
	
	public void status() {
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("fechado ? "+ this.fecha);
		System.out.println("tipo: " + this.getTipo());
	}
	
}
