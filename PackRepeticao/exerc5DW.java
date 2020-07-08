package PackJava08;

import java.util.Scanner;

public class exerc5DW {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		float n,sn=0;
		do {
			System.out.printf("Digite um número: ");
			n=ler.nextFloat();
			sn=sn+n;
		}while(n!=0);
		System.out.println("\nSoma dos números digitados = "+sn);
	}

}
