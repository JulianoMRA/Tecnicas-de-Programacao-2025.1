package Aulas;

public class Pessoa{
	String nome;
	String cpf;
	Endereco end;
	
	public Pessoa(String nome, String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public Endereco getEnd() {
		return end;
	}
}
