package PackJava10;

import java.util.Scanner;

public class exerc2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		float alt,pes,imc;
		System.out.printf("Digite seu peso: ");
		pes=ler.nextFloat();
		System.out.printf("Digite sua altura: ");
		alt=ler.nextFloat();
		imc=pes/(alt*alt);
		if(imc>0 && imc<18.5) {
			System.out.printf("\nIMC =|"+Math.round(imc)+"|--considerado--|Abaixo do peso|");
		}else if(imc>18.5 && imc<25) {
			System.out.printf("\nIMC =|"+Math.round(imc)+"|--considerado--|Peso normal|");	
		}else if(imc>25 && imc<30) {
			System.out.printf("\nIMC =|"+Math.round(imc)+"|--considerado--|Acima do peso|");
		}else {
			System.out.printf("\nIMC =|"+Math.round(imc)+"|--considerado--|Obeso|");
		}
		
	}

}
