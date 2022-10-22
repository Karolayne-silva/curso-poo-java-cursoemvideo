package prática;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0.00);
		
	}
	
	public void abrir(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "cc" ) {
			
		this.setSaldo(50.00);
			
		}
		else if (t == "cp") { 
			this.setSaldo(150.00);
		}
	}
	
	public void fechar() {
		
		
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro ainda");
		}
		else if(this.getSaldo() < 0) {
			System.out.println("Sua conta não pode ser fechada pois tem débito");
		}
		else {
			this.setStatus(false);
		}
	}
	
	public void depositar(double v) {
		
		if (this.getStatus()== true) {
			System.out.println("Você pode depositar");
			this.setSaldo(this.getSaldo()+ v);
			System.out.println("Déposito realizado na conta de" + this.getDono());
		}
		else {
			System.out.println("Você não pode depositar numa conta fechada");
		}
	}
	
	public void sacar(double v) {
		
		if (this.getStatus() == true) {
			
			if(this.getSaldo() > v) {
				this.setSaldo(this.getSaldo()- v);
				System.out.println("Saque realizado em "+ this.getDono());
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Você não pode sacar");
		}
	}
		
	
	public void pagarMensal () {
		int valor = 0;
		
		if (this.getTipo() == "cc") {
			valor = 12;
		}
		else if (this.getTipo()== "cp") {
			valor = 20;
		}
		
			
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por: "+ this.getDono());
			
		}
		else {
			System.out.println("Impossivel");
		}
			
		
		
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setStatus(boolean s) {
		this.status = s;
	}
	public boolean getStatus() {
		return this.status;
	}
	
	public void estadoAtual() {
		System.out.println("----------------");
		System.out.println("Número da conta: " + this.numConta);
		System.out.println("Tipo da conta: "+ this.tipo);
		System.out.println("Nome do dono: "+ this.dono);
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
	}
	
}


