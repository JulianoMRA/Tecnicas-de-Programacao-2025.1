package br.ufc.dc.tpi.banco;
import br.ufc.dc.tpi.banco.contas.Conta;

public class Main {
	public static void main(String[] args) {
		
		BancoVector banco;
		banco = new BancoVector();
		Conta conta;
		conta = new Conta("1234-5", "Juliano");
		Conta conta1;
		conta1 = new Conta("1234-6", "Vanessa");
		banco.cadastrar(conta);
		banco.cadastrar(conta1);
		
		
		// Testando Funcionalidades
		conta.creditar(1000);
		conta1.creditar(2000);
		banco.transferir("1234-5", "1234-6", 500);
		banco.debitar("1234-6", 400);
		banco.creditar("1234-5", 1500);
		
		
		//Prints:
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta.GetNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta.GetNome() + ": " + conta.GetNumero());
		System.out.println("Saldo: " + banco.saldo("1234-5"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta1.GetNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta1.GetNome() + ": " + conta1.GetNumero());
		System.out.println("Saldo: " + banco.saldo("1234-6"));
	}
}
