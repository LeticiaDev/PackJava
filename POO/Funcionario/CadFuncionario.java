package Funcionario;

public class CadFuncionario {
	private String nomeFunc;
	private String cargoFunc;
	private String diaFolga;
	
	public CadFuncionario(String nome, String cargo, String folga) {
		nomeFunc=nome;
		cargoFunc=cargo;
		diaFolga=folga;
	}public String getFuncionario() {
		String Funcionario=nomeFunc+" "+cargoFunc+" "+diaFolga;
		return Funcionario;	
		}
}
