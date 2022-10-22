package prática;

public class prática {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		
		p1.setNumConta(22222);
		p1.setDono("olivia");
		p1.abrir("cp");
		p1.depositar(10.00);
		p1.estadoAtual();
		

	}

}
