package PackJava10;

public class exerc4 {
	public static void main (String args[]) {
		float n=1,s=0;
		for(int i=1;i<=50;i++) {
			s+=(n/i);
			n+=2;
		}
		System.out.println("Valor total da soma: "+s);
	}
}
