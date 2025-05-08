package br.ufc.dc.tpi.banco.contas;

public class ContaImposto extends ContaAbstrata {
	public ContaImposto(String numero, String nome) {
		super(numero, nome);
	}
	
	public void debitar(double valor) {
		saldo = saldo - (valor + (valor * 0.001));
	}
}
