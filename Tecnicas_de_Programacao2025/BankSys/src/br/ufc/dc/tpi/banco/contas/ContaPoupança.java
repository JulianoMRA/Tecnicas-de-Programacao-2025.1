package br.ufc.dc.tpi.banco.contas;

public class ContaPoupança extends Conta{
	
	public ContaPoupança(String numero, String nome) {
		super(numero, nome);
	}
	
	public void renderJuros(double taxa) {
		creditar(getSaldo() * taxa);
	}
}
