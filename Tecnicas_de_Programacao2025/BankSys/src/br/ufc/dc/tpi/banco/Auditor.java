package br.ufc.dc.tpi.banco;

public class Auditor {
	public void auditar(IBanco banco) {
		if (banco.saldoTotal() / banco.numContas() > 500) {
			System.out.println("Aprovado!!!");
		} else {
			System.out.println("Reprovado.");
		}
	}
}
