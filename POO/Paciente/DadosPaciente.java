package Paciente;

public class DadosPaciente {
	public static void main (String ards[]) {
		System.out.println("***FICHA DO PACIENTE***");
		CadPaciente paciente1 = new CadPaciente("Maria Dolores","\n26 anos","\nPouco urgente (verde)\n");
		System.out.println(paciente1.getPaciente());
		CadPaciente paciente2 = new CadPaciente("Josefina Amado","\n35 anos","\nNão urgente (azul)\n");
		System.out.println(paciente2.getPaciente());
		CadPaciente paciente3 = new CadPaciente("Catarina Mitto","\n42 anos","\nUrgente (amarelo)");
		System.out.println(paciente3.getPaciente());
	}

}
