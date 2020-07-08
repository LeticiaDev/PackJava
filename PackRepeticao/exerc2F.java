package PackJava08;

import java.util.Scanner;

public class exerc2F {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int number,c,npar=0,nimpar=0;
		for(c=0;c<10;c++) {
			System.out.printf("Digite um número: ");
			number=ler.nextInt();
			if(number%2==0) {
				npar++;
			}else {
				nimpar++;
			}
		}System.out.println("Foram digitados "+npar+" números par(es) e "+nimpar+" impar(es)");
	}

}