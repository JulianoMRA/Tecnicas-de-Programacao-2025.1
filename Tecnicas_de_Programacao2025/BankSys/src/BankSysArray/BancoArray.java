package BankSysArray;

public class BancoArray {
	private ContaArray[] contas;
	private int indice = 0;
	
	public BancoArray(){
		contas = new ContaArray[100];
	}
	
	public void cadastrar(ContaArray conta) {
		contas[indice] = conta;
		indice++;
	}
	
	public ContaArray procurar(String numero) {
		int i = 0;
		boolean achou = false;
		while((!achou) && (i<indice)) {
			if(contas[i].GetNumero().equals(numero)) {
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
		ContaArray conta = procurar(numero);
		conta.creditar(valor);
	}
	
	public void debitar(String numero, double valor) {
		ContaArray conta = procurar(numero);
		conta.debitar(valor);
	}
	
	public double saldo(String numero) {
		ContaArray conta = procurar(numero);
		return conta.GetSaldo();
	}
	
	public void transferir(String origem, String destino, double valor) {
		ContaArray ContaOrigem = procurar(origem);
		ContaArray ContaDestino = procurar(destino);
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
