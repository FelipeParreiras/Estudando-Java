package aula35;

public class testeAutoUnboxing {

	public static void main(String[] args) {

        //AutoBoxing
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';
		
        // AutoUnboxing
        int num7 = num3;
        num7++;
        System.out.println(num7);
        Integer num8 = num7/num3;

        // Mau uso do AutoUnboxing
        Double b, c , d;
        b = 10.0;
        c = 12.2;
        d = 4.7;

        Double media = (b + c + d) / 3;
        System.out.println(media);
		}

}
