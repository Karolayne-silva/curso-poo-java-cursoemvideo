package aula011;

public class aula011 {

	public static void main(String[] args) {
		
		//Visitante v1 = new Visitante();
		
		//v1.setNome("juvenal");
		//v1.setIdade(22);
		//v1.setSexo("m");
		//System.out.println(v1.toString());
		Aluno a1 = new Aluno();
		
		a1.setNome("claudio");
		a1.setMatricula(1111);
		a1.setCurso("informatica");
		a1.setIdade(16);
		a1.setSexo("m");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(2222);
		b1.setNome("jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("m");
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.nome = "Fabio";
		p1.sexo = "M";
		p1.setSalario(200f);
		p1.setEspecialidade("ciencias");
		
		Tecnico t1 = new Tecnico();
		
		t1.setNome("Gustavo");
		t1.setSexo("M");
		t1.setIdade(43);
		t1.setRegistroProfissional(4762);
		t1.pagarMensalidade();
		t1.praticar();
	}

}
