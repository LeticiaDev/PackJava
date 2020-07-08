package PackJava08;

import java.util.Scanner;

public class exerc6DW {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int n,med,nm=0,sn=0;
		do {
			System.out.printf("Digite um número inteiro: ");
			n=ler.nextInt();
			if(n%3==0 && n!=0) {
				sn=sn+n;
				nm++;
			}
		}while(n!=0);
		med=sn/nm;
		System.out.println("\nMédia dos multiplos de 3 é: "+med);
	}

}
