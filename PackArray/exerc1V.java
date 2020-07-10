package PackJava09;

public class exerc1V {
	public static void main (String args[]) {
		int[] vet = {1,0,5,-2,-5,7};
		int soma=0;
		for(int i=0;i<vet.length;i++) {
			if((i==0) || (i==1) || (i==5)) {
				soma+=vet[i];
			}if(i==4) {
				vet[i]=100;
			}
		}for(int i=0;i<vet.length;i++) {
			System.out.println("Valores do vetor "+(i+1)+"ª posição = "+vet[i]);
		}System.out.println("\nSoma dos valores = "+soma);
	}

}
