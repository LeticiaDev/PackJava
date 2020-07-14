package Paciente;

public class CadPaciente {
	private String nomePaciente;
	private String idadePaciente;
	private String classificaPaciente;
	
	public CadPaciente(String nome, String idade, String clasRisco) {
		nomePaciente=nome;
		idadePaciente=idade;
		classificaPaciente=clasRisco;
	}
	public String getPaciente() {
		String Paciente=nomePaciente+" "+idadePaciente+" "+classificaPaciente;
		return Paciente;
	}
}
