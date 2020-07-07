package PackageJava;

import java.util.Scanner;

public class exerc5 {
	public static void main (String args[]) {
		Scanner nota = new Scanner (System.in);
		float n1,n2,n3;
		double m;
		System.out.printf("Digite a primeira nota: ");
		n1 = nota.nextFloat();
		System.out.printf("Digite a segunda nota: ");
		n2 = nota.nextFloat();
		System.out.printf("Digite a terceira nota: ");
		n3 = nota.nextFloat();
		m=((n1*2)+(n2*3)+(n3*5))/(2+3+5);
		System.out.printf("Média final é: %2.2f",m);
	}

}
