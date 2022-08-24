package aula06;

public class ControleRemoto implements Controlador {
	
	//atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// metodo especiais
	
	public ControleRemoto() {
		this.setLigado(false);
		this.setVolume(50);
		this.setTocando(false);
	}
	
	private int getVolume() {
		return this.volume;
	}
	
	private boolean getLigado() {
		return this.ligado;
	}
	
	private boolean getTocando() {
		return this.tocando;
	}
	
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	
	private void setTocando(boolean t) {
		this.tocando = t;
	}

	//metodos abstratos
	
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		
		if(this.getLigado()) {
			System.out.println("Está ligado?" + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.println("volume: " + this.getVolume());
			
			for(int i = 0; i <= this.getVolume();i+=10 ) {
				System.out.print("|");
		}		
		}
		else {
			System.out.println("Não foi possível abrir menu");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
	}

	@Override
	public void maisVolume() {
		
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume()+ 5);
		}
		
	}

	@Override
	public void menosVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume()> 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() < 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	
	
	
}
