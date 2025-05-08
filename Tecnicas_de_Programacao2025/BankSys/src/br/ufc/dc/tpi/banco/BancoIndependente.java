package br.ufc.dc.tpi.banco;
import br.ufc.dc.tpi.banco.contas.*;

import java.util.Vector;

public class BancoIndependente implements IBanco{
	private Vector<ContaAbstrata> contas = new Vector<ContaAbstrata>();
	private int indice = 0;
	
	
	private double saldoTotal = 0;
	private int numContas = 0;
	
	
	
	
	public void cadastrar(ContaAbstrata conta) {
		contas.add(conta);
		indice++;
		numContas++;
	}
	
	private ContaAbstrata procurar(String numero) {
		int i = 0;
		boolean achou = false;
		
		while((!achou) && (i<indice)) {
			if(contas.get(i).getNumero() == numero) {
				achou = true;
			} else {
				i++;
			}
			
			if(achou == true) {
				return contas.get(i);
			} 
		}
		return null;
	}
	
	public void creditar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		conta.creditar(valor);
		saldoTotal = saldoTotal + valor;
	}
	
	public void debitar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		conta.debitar(valor);
		saldoTotal = saldoTotal - valor;
	}
	
	public double saldo(String numero) {
		ContaAbstrata conta = procurar(numero);
		return conta.getSaldo();
	}

	public void transferir(String origem, String destino, double valor) {
		ContaAbstrata ContaOrigem = procurar(origem);
		ContaAbstrata ContaDestino = procurar(destino);
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
	
	public void renderJuros(String numero, double taxa) {
		ContaPoupança contap;
		contap = (ContaPoupança) procurar(numero);
		
		if (contap == null) {
			System.out.println("Conta Inexistente.");
		} else {
			contap.renderJuros(taxa);
		}
	}
	
	public void renderBonus(String numero) {
		ContaEspecial contaE;
		contaE = (ContaEspecial) procurar(numero);
		
		if (contaE == null) {
			System.out.println("Conta Inexistente.");
		} else {
			contaE.renderBonus();
		}
	}

	public double saldoTotal() {
		return saldoTotal;
	}

	public int numContas() {
		return numContas;
	}
}
