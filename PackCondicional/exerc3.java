package PackJava07;

import java.util.*;

public class exerc3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int categoria;
		System.out.printf("Escolha a op��o onde encaixa sua idade: ");
		System.out.printf("\n1-10 a 14 \n2-15 a 17 \n3-18 a 25 \n4-Maior 25\n");
		categoria=ler.nextInt();
		switch(categoria) {
		case 1:
			System.out.println("\nVoc� esta na categoria infantil!");
			break;
		case 2:
			System.out.println("\nVoc� esta na categoria juvenil!");
			break;
		case 3:
			System.out.println("\nVoc� esta na categoria adulto!");
			break;
		case 4:
			System.out.println("\nVoc� n�o se encaixa nas categorias existentes!");
			break;
		}
	}

}
