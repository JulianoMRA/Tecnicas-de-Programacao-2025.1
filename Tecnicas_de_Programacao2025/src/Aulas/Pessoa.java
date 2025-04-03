package Aulas;

public class Pessoa{
	String nome;
	String cpf;
	Endereco end;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
}
