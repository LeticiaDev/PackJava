package PackJava07;

import java.util.Scanner;

public class exerc1 {
	public static void main (String args[]) {
		Scanner numero = new Scanner(System.in);
		int n1,n2,n3;
		System.out.printf("Digite o primeiro n�mero inteiro: ");
		n1=numero.nextInt();
		System.out.printf("Digite o segundo n�mero inteiro: ");
		n2=numero.nextInt();
		System.out.printf("Digite o terceiro n�mero inteiro: ");
		n3=numero.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("N�mero "+n1+ " � o maior!");
		}else if(n2>n1 && n2>n3) {
			System.out.println("N�mero "+n2+ " � o maior!");
		}else {
			System.out.println("N�mero "+n3+ " � o maior!");
		}
	}

}
