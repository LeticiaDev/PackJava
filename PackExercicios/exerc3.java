package PackJava10;

import java.util.Scanner;

public class exerc3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int n,c1=0,c2=0,c3=0,c4=0;
		do {
			System.out.printf("Digite um n�mero: ");
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
		System.out.println("\n"+c1+" n�mero(s) no 1� intervalo.");
		System.out.println(""+c2+" n�mero(s) no 2� intervalo.");	
		System.out.println(""+c3+" n�mero(s) no 3� intervalo.");	
		System.out.println(""+c4+" n�mero(s) no 4� intervalo.");	
	}

}
