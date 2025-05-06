package br.ufc.dc.tpi.banco.contas;

public class ContaImposto extends Conta {
	public ContaImposto(String numero, String nome) {
		super(numero, nome);
	}
	
	public void debitar(double valor) {
		super.debitar(valor + valor * 0.001);
	}
}
