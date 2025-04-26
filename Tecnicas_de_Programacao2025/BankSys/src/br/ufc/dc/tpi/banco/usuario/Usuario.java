package br.ufc.dc.tpi.banco.usuario;

public class Usuario {
	private String nome;
	private String cpf;
	private String rg;
	private int ano_nasc;
	
	
	public Usuario(String nome, String cpf, String rg, int ano_nasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.ano_nasc = ano_nasc;
	}
	
	public String GetNome() {
		return nome;
	}
	
	public String GetCPF() {
		return cpf;
	}
	
	public String GetRG() {
		return rg;
	}
	
	public int GetAno_Nasc() {
		return ano_nasc;
	}
}
