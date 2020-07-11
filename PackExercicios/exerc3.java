package PackJava10;

import java.util.Scanner;

public class exerc3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int n,c1=0,c2=0,c3=0,c4=0;
		do {
			System.out.printf("Digite um número: ");
			n=ler.nextInt();
			if(n>=0 && n<=25) {
				c1++;
			}if(n>=26 && n<=50) {
				c2++;
			}if(n>=51 && n<=75) {
				c3++;
			}if(n>=76 && n<=100) {
				c4++;
			}			
			
		}while(n>=0);
		System.out.println("\n"+c1+" número(s) no 1º intervalo.");
		System.out.println(""+c2+" número(s) no 2º intervalo.");	
		System.out.println(""+c3+" número(s) no 3º intervalo.");	
		System.out.println(""+c4+" número(s) no 4º intervalo.");	
	}

}
