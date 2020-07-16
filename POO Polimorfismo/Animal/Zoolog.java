package Animal;

public class Zoolog {
	public static void main(String args[]) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("CACHORRO");
		cachorro.setNome("Jujuba");
		System.out.println(cachorro.getNome());
		cachorro.setIdade(15);
		System.out.println(cachorro.getIdade());
		cachorro.emiteSom(null);
		cachorro.acao(null);
		System.out.println("-----------");
		
		System.out.println("CAVALO");
		cavalo.setNome("Jeronimo");
		System.out.println(cavalo.getNome());
		cavalo.setIdade(12);
		System.out.println(cavalo.getIdade());
		cavalo.emiteSom(null);
		cavalo.acao(null);
		System.out.println("-----------");

		System.out.println("PREGUIÇA");
		preguica.setNome("Jurema");
		System.out.println(preguica.getNome());
		preguica.setIdade(15);
		System.out.println(preguica.getIdade());
		preguica.emiteSom(null);
		preguica.acao(null);
		System.out.println("-----------");
	}
}
