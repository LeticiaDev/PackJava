package PackJava07;

import java.util.Scanner;

public class exerc2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		float n1,n2,n3;
		System.out.printf("Digite o 1� n�mero: ");
		n1=ler.nextFloat();
		System.out.printf("Digite o 2� n�mero: ");
		n2=ler.nextFloat();
		System.out.printf("Digite o 3� n�mero: ");
		n3=ler.nextFloat();
		if(n1<=n2 && n2<=n3) {
			System.out.println("\nA ordem crescente �: "+n1+" "+n2+" "+n3);
		}else if(n1<n3 && n3<n2) {
			System.out.println("\nA ordem crescente �: "+n1+" "+n3+" "+n2);
		}else if(n2<n1 && n1<n3) {
			System.out.println("\nA ordem crescente �: "+n2+" "+n1+" "+n3);
		}else if(n2<n3 && n3<n1) {
			System.out.println("\nA ordem crescente �: "+n2+" "+n3+" "+n1);
		}else if(n3<n1 && n1<n2) {
			System.out.println("\nA ordem crescente �: "+n3+" "+n1+" "+n2);
		}else {
			System.out.println("\nA ordem crescente �: "+n3+" "+n2+" "+n1);
		}
	}

}
