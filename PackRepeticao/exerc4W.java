package PackJava08;

import java.util.Scanner;

public class exerc4W {
	public static void main(String args []) {
		Scanner leia = new Scanner (System.in);
		int id,gen,cp,pesc=0,mn=0,ha=0,pesnmaior=0,pescmenor=0,p=0;
		while(p<3){
		System.out.printf("Digite sua idade: ");
		id=leia.nextInt();
		System.out.printf("Digite: |1-Feminino|*|2-Masculino| ");
		gen=leia.nextInt();
		System.out.printf("Digite: |1-Calme|*|2-Nervose|*|3-Agressive|");
		cp=leia.nextInt();
		System.out.printf("\n");
		p++;
		if(cp==1) {
			pesc++;
		}if(gen==1 && cp==2) {
			mn++;			
		}if(gen==2 && cp==3) {
			ha++;
		}if(cp==2 && id>40) {
			pesnmaior++;
		}if(cp==1 && id<18) {
			pescmenor++;
			}
		}System.out.println("\n******RESULTADO DA PESQUISA******");
		 System.out.println(+pesc+" pessoa(s) calma(s)");
		 System.out.println(+mn+" mulher(es) nervosa(s):");
		 System.out.println(+ha+" homem(ns) agressivo(s):");
		 System.out.println(+pesnmaior+" pessoa(s) nervosa(s) acima de 40 anos");
		 System.out.println(+pescmenor+" pessoa(s) calma(s) com menos de 18 anos");
	}

}
