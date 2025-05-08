package br.ufc.dc.tpi.banco;

import java.util.Vector;

import br.ufc.dc.tpi.banco.contas.ContaAbstrata;

public class VectorContas implements IRepositorioContas{
	private Vector<ContaAbstrata> contas = new Vector<ContaAbstrata>();
	private int indice = 0;
	
	public void inserir(ContaAbstrata conta) {
		contas.add(conta);
		indice++;
	}
	
	public ContaAbstrata procurar(String numero) {
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

	public void remover(String numero) {
		int i = 0;
		boolean achou = false;
		
		while((!achou) && (i<indice)) {
			if(contas.get(i).getNumero() == numero) {
				achou = true;
			} else {
				i++;
			}
			
			if(achou == true) {
				contas.remove(i);
			} 
		}
		System.out.println("Conta Inexistente.");
	}

	public ContaAbstrata[] listar() {
		ContaAbstrata[] array = new ContaAbstrata[contas.size()];

	    for (int i = 0; i < contas.size(); i++) {
	        array[i] = contas.get(i);
	    }

	    return array;
	}

	public int tamanho() {
		int tamanho = 0;
		
		while (tamanho < contas.size()) {
			tamanho++;
		}
		
		return tamanho;
		
	}

}
