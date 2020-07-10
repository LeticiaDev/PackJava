package PackJava09;

import java.util.Scanner;

public class exerc2V {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[]vet=new int[6];
		int tpar=0,timpar=0;
		for(int i=0;i<vet.length;i++) {
			System.out.printf("Digite um número: ");
			vet[i]=ler.nextInt();
			if(vet[i]%2==0) {
				System.out.println("\nNúmero par: "+vet[i]);
				tpar+=vet[i];
			}else {
				System.out.println("\nNúmero ímpar: "+vet[i]);
				timpar++;
			}
		}System.out.println("\nSoma números pares: "+tpar);
		 System.out.println("Total de números ímpares: "+timpar);

	}

}
