package projetopessoas;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazeraniversario() {
		this.idade ++;
	}
	
	public String getSexo() {
		return sexo;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + "]";
	}
	
	
}
