package PackJava09;

import java.util.Scanner;

public class exerc3M {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		int[][]tab= new int[3][3];
		int vm=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("Digite um número: ");
				tab[i][j]=ler.nextInt();
				if(tab[i][j]>10) {
					vm++;
				}
			}
		}System.out.println("\nTabela possui "+vm+" valor(es) maior(es) que 10");
	}

}
