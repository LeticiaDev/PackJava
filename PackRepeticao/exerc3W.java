package PackJava08;

import java.util.Scanner;

public class exerc3W {
	public static void main(String args[]) {
		Scanner leia = new Scanner (System.in);
		int idmenor=0,idmaior=0,idade=0;
		while(idade!=-99) {
			System.out.printf("Digite sua idade: ");
			idade=leia.nextInt();
			if(idade<21 && idade>0) {
				idmenor++;
			}if(idade>50 && idade<100) {
				idmaior++;
			}		
		}System.out.println("Total de "+idmenor+" pessoa(s) com menos de 21 anos");
		 System.out.println("Total de "+idmaior+" pessoa(s) com mais de 50 anos");
	}

}
