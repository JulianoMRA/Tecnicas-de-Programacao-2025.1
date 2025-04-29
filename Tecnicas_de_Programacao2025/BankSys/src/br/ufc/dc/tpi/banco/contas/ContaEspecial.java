package br.ufc.dc.tpi.banco.contas;

public class ContaEspecial extends Conta{
	
	private double bonus;
	
	public ContaEspecial(String numero, String nome) {
		super(numero, nome);
	}
	
	public void renderBonus() {
		super.creditar(bonus);
		bonus = 0;
	}
	
	public void creditar(double valor) {
		bonus = bonus + (valor * 0.01);
		super.creditar(valor);
	}
}
