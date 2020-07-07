package PackJava07;

import java.util.*;

public class exerc4 {
	public static void main(String []args) {
		Scanner ler = new Scanner (System.in);
		int number;
		double rst;
		System.out.printf("Digite um número: ");
		number=ler.nextInt();
		if(number%2==0){
			rst=Math.sqrt(number);
			System.out.println("\nRaiz quadrada do número par é: "+rst);
		}else {
			rst=Math.pow(number, 2);
			System.out.println("\nPotencia do número impar é: "+rst);
		}
	}

}
