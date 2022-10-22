package aula014;

public class Aula014 {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de poo");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de html5");
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Karol", 19, "F", "karol.veny");
		g[1] = new Gafanhoto("Jubileu", 22, "M", "juba");
		
		Visualizacao vi[] = new Visualizacao[3];
		vi[0]= new Visualizacao(g[0], v[2]); //karol assiste html
		vi[0].avaliar();
		System.out.println(vi[0].toString());
		
		vi[1] = new Visualizacao(g[0], v[1]); //karol assiste php
		vi[1].avaliar(87.0f);
		System.out.println(vi[1].toString());
		
		
		
	}

}
