package PackageJava;

import java.util.Scanner;

public class exerc2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int id,d,m,a;
		System.out.printf("Digite sua idade em dias: ");
		id = ler.nextInt();
		a=id/365;
		m=(id%365)/30;
		d=(id%365)%30;
		System.out.println("Você tem "+a+" ano(s), "+m+" mes(es) e "+d+" dia(s) ");
	}

}
