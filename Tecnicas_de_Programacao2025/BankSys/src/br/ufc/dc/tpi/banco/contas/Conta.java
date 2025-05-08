package br.ufc.dc.tpi.banco.contas;

public class Conta extends ContaAbstrata{

	public Conta(String numero, String nome) {
		super(numero, nome);
	}
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
}
