package aula07;

public class aula07 {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("pretty boy", "França", 31, 68.9f, 1.75f, 11, 3, 1 );
		l[1] = new Lutador("putscript", "Brasil", 29, 57.8f, 1.68f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 80.9f, 1.65f, 12, 2, 1);
		l[3] = new Lutador("dead code", "Australia", 28, 81.6f, 1.93f, 13, 0, 2);
		l[4] = new Lutador("UFOcobol", "brasil", 37, 119.3f, 1.70f, 5, 4, 3);
		l[5] = new Lutador("nerdart", "EUA", 30, 105.7f, 1.81f, 12, 2, 4);

		Luta UEC01 = new Luta();
		
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		
		
	}

}
