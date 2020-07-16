package Animal;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public Animal () {
	}
	
	public Animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	abstract public void emiteSom (String som);
	abstract public void acao (String acao);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
