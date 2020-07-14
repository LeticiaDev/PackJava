package Cliente;

public class CadCliente {
	private String nomeCliente;
	private String documentCliente;
	private String telefoneCliente;
	private String emailCliente;
	
	public CadCliente (String nome, String document, String tel, String email) {
		nomeCliente = nome;
		documentCliente = document;
		telefoneCliente = tel;
		emailCliente = email;
	}
	public String getCadCliente() {
		String CadCliente=nomeCliente+" "+documentCliente+" "+telefoneCliente+" "+emailCliente;
		return CadCliente;
	}

}
