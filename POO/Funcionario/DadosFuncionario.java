package Funcionario;

public class DadosFuncionario {
	public static void main (String args[]) {
	CadFuncionario funcionario1 = new CadFuncionario("Roberta Sanchez","\nAuxiliar administrativo","\nQuinta\n");
	System.out.println(funcionario1.getFuncionario());
	CadFuncionario funcionario2 = new CadFuncionario("Marilda Carvalho","\nCoordenadora","\nDomingo\n");
	System.out.println(funcionario2.getFuncionario());
	CadFuncionario funcionario3 = new CadFuncionario("Peter Parker","\nAssitente financeiro","\nS�bado");
	System.out.println(funcionario3.getFuncionario());
	}

}
