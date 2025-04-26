package br.ufc.dc.tpi.banco.contas;
import br.ufc.dc.tpi.banco.usuario.*;

public class ContaPoupança extends Conta{
	
	public ContaPoupança(String numero, Usuario user) {
		super(numero, user);
	}
	
	public void renderJuros(double taxa) {
		creditar(GetSaldo() * taxa);
	}
}
