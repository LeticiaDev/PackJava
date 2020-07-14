package Cliente;

public class DadosCliente {
	public static void main (String args []) {
		System.out.println("***DADOS DO CLIENTE***");
		CadCliente cad1 = new CadCliente ("Helena Pavão","\n458.896.785-14","\n(11) 95655-5556","\nhelenapav@gmail.com\n");
		System.out.println(cad1.getCadCliente());
		CadCliente cad2 = new CadCliente ("Clara Conceição ","\n123.321.564-98","\n(11) 98656-5686","\nclarinha@gmail.com\n");
		System.out.println(cad2.getCadCliente());
		CadCliente cad3 = new CadCliente ("Matilda da Silva ","\n987.789.465-32","\n(11) 96362-6164 ","\nmatisilva@gmail.com");
		System.out.println(cad3.getCadCliente());
	}

}
