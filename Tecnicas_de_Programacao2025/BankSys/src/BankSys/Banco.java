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
}
