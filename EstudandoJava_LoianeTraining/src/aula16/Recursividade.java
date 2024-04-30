package aula16;

public class Recursividade {
	
	public static int fatorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * fatorial(--num);
	}
}
