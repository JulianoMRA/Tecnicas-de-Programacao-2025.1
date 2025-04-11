package BankSys;

public class Banco {
	private Conta[] contas;
	private int indice = 0;
	
	public Banco(){
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
		int i = 0;
		while(i<indice) {
			if(contas[i].numero().equals(numero)) {
				break;
			} else {
				i++;
			}
		}
		contas[i].creditar(valor);
	}
	
	public void debitar(String numero, double valor) {
		int i = 0;
		while(i<indice) {
			if(contas[i].numero().equals(numero)) {
				break;
			} else {
				i++;
			}
		}
		contas[i].debitar(valor);
	}
	
	public double saldo(String numero) {
		int i = 0;
		while(i<indice) {
			if(contas[i].numero().equals(numero)) {
				break;
			} else {
				i++;
			}
		}
		return contas[i].saldo();
	}
	
	public void transferir(String origem, String destino, double valor) {
		// Procurando a conta origem e debitando o valor:
		int i = 0;
		while(i<indice) {
			if(contas[i].numero().equals(origem)) {
				break;
			} else {
				i++;
			}
		}
		contas[i].debitar(valor);
		// Procurando a conta destino e creditando o valor
		int j = 0;
		while(j<indice) {
			if(contas[j].numero().equals(destino)) {
				break;
			} else {
				j++;
			}
		}
		contas[j].creditar(valor);
	}
}
