package PackJava10;

import java.util.Scanner;

public class exerc5 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		float[] vet = new float[5]; int cod;
		for(int i=0;i<vet.length;i++) {
			System.out.printf("Digite um n�mero real "+(i+1)+"� posi��o: ");
			vet[i]=ler.nextFloat();
		}System.out.println("\n*****ESCOLHA UMA OP��O*****");
		 System.out.println("|0| Finalizar o programa.");
		 System.out.println("|1| Mostrar valores em ordem direta.");
		 System.out.println("|2| Mostrar valores em ordem inversa.");
		 cod=ler.nextInt();
		 if(cod==0) {
			 System.out.println("\nPrograma finalizado!");
		 }else if(cod==1) {
			 for(int i=0;i<vet.length;i++) {
				 System.out.println("Ordem direta "+(i+1)+"� posi��o: "+vet[i]);
			 }
		 }else if(cod==2) {
			 for(int i=4;i>=0;i--) {
				 System.out.println("Ordem inversa "+(i)+"� posi��o: "+vet[i]);
			 }
		 }else {
			 System.out.println("\nOp��o inv�lida!");
		 }
	}
}
