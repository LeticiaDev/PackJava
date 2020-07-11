package PackJava10;

import java.util.Scanner;

public class exerc1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		float valor, vt, cond1, cond2,cond3, cond4; int condp;
		System.out.printf("Digite o valor do produto: ");
		valor=ler.nextFloat();
		System.out.println("\n\t****ESCOLHA A OPÇÃO DE PAGAMENTO****");
		System.out.println("|1| À vista em dinheiro ou cheque, receba 20% de desconto.");
		System.out.println("|2| À vista no cartão de crédito, receba 15% de desconto.");
		System.out.println("|3| Em 2x, preço normal de etiqueta sem juros.");
		System.out.println("|4| Em 3x, preço normal de etiqueta mais juros de 10%.");
		condp=ler.nextInt();
		switch(condp) {
		case 1:
			cond1=(valor*20)/100;
			valor=valor-cond1;
			System.out.println("Desconto de 20%, valor total a pagar--: R$"+valor);
			break;
		case 2:
			cond2=(valor*15)/100;
			valor=valor-cond2;
			System.out.println("Desconto de 15%, valor total a pagar--: R$"+valor);
			break;
		case 3:
			cond3=valor/2;
			System.out.printf("Pagamento em 2x, sem juros, valor: R$%2.2f",cond3);
			System.out.println("\n---------------------------|Total R$"+valor+"|");
			break;
		case 4:
			cond4=(valor*10)/100;
			vt=valor+cond4;
			valor=(valor+cond4)/3;
			System.out.printf("Pagamento em 3x, com juros, valor: R$%2.2f",valor);
			System.out.println("\n---------------------------|Total R$"+vt+"|");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}

}
