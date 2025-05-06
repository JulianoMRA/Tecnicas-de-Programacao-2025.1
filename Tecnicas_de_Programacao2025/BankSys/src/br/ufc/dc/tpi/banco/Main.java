package br.ufc.dc.tpi.banco;
import br.ufc.dc.tpi.banco.contas.*;

public class Main {
	public static void main(String[] args) {
		
		BancoVector banco;
		banco = new BancoVector();
		Conta conta;
		conta = new ContaImposto("1234-5", "Juliano");
		Conta conta1;
		conta1 = new ContaImposto("1234-6", "Vanessa");
		banco.cadastrar(conta);
		banco.cadastrar(conta1);
		
		// Testando features da poupança
		ContaPoupança contap = new ContaPoupança("7777-7", "Edileudo");
		banco.cadastrar(contap);
		contap.creditar(600);
		banco.renderJuros("7777-7", 0.1);
		
		// Testando features da Conta Especial
		ContaEspecial contaE = new ContaEspecial("6666-6", "Jorge");
		banco.cadastrar(contaE);
		contaE.creditar(1000);
		banco.renderBonus("6666-6");
		
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
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + contap.GetNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + contap.GetNome() + ": " + contap.GetNumero());
		System.out.println("Saldo: " + banco.saldo("7777-7"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + contaE.GetNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + contaE.GetNome() + ": " + contaE.GetNumero());
		System.out.println("Saldo: " + banco.saldo("6666-6"));
	}
}
