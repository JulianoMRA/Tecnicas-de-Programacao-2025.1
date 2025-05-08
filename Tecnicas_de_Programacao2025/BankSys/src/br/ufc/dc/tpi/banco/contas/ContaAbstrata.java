package br.ufc.dc.tpi.banco.contas;

public abstract class ContaAbstrata {
	protected String numero;
	protected String nome;
	protected double saldo;
	
	public ContaAbstrata(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		saldo = 0;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public abstract void debitar(double valor);
	
	public String getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
