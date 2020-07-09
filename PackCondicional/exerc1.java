package PackJava07;

import java.util.Scanner;

public class exerc1 {
	public static void main (String args[]) {
		Scanner numero = new Scanner(System.in);
		int n1,n2,n3;
		System.out.printf("Digite o 1º número inteiro: ");
		n1=numero.nextInt();
		System.out.printf("Digite o 2º número inteiro: ");
		n2=numero.nextInt();
		System.out.printf("Digite o 3º número inteiro: ");
		n3=numero.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("Número "+n1+ " é o maior!");
		}else if(n2>n1 && n2>n3) {
			System.out.println("Número "+n2+ " é o maior!");
		}else {
			System.out.println("Número "+n3+ " é o maior!");
		}
	}

}
