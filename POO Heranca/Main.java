package Pessoa;

public class Main {
	public static void main(String args[]) {
		Fornecedor fornec = new Fornecedor();
		fornec.setNome("Matilda Oliver");
		fornec.setEndereco("Rua das Coqueiras");
		fornec.setTelefone("(11) 9995-9999");
		fornec.setValorCredito(895);
		fornec.setValorDivida(500);
		
		System.out.println(fornec.getNome());
		System.out.println(fornec.getEndereco());
		System.out.println(fornec.getTelefone());
		System.out.println(fornec.obterSaldo());
	}
}
