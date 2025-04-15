package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.Conta;

public class BancoArray {
	private Conta[] contas;
	private int indice = 0;
	
	public BancoArray(){
		contas = new Conta[100];
	}
	
	public void cadastrar(Conta conta) {
		contas[indice] = conta;
		indice++;
	}
	
	public Conta procurar(String numero) {
		int i = 0;
		boolean achou = false;
		while((!achou) && (i<indice)) {
			if(contas[i].numero().equals(numero)) {
				achou = true;
			} else {
				i++;
			}
			if(achou == true) {
				return contas[i];
			} 
		}
		return null;
	}
	
	public void creditar(String numero, double valor) {
		Conta conta = procurar(numero);
		conta.creditar(valor);
	}
	
	public void debitar(String numero, double valor) {
		Conta conta = procurar(numero);
		conta.debitar(valor);
	}
	
	public double saldo(String numero) {
		Conta conta = procurar(numero);
		return conta.saldo();
	}
	
	public void transferir(String origem, String destino, double valor) {
		Conta ContaOrigem = procurar(origem);
		Conta ContaDestino = procurar(destino);
		if(ContaOrigem == null) {
			System.out.println("Conta de Origem inexistente");
		}
		else if(ContaDestino == null) {
			System.out.println("Conta de Destino inexistente");
		}
		else {
			ContaOrigem.debitar(valor);
			ContaDestino.creditar(valor);
		}
	}
}
