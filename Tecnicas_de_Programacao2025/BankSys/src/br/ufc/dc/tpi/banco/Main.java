package br.ufc.dc.tpi.banco;
import br.ufc.dc.tpi.banco.contas.*;

public class Main {
	public static void main(String[] args) {
		
		BancoIndependente banco = new BancoIndependente();
		Auditor auditor = new Auditor();
		
		//Testando features da Conta Padrão
		ContaAbstrata conta = new ContaImposto("1234-5", "Juliano");;
		ContaAbstrata conta1 = new ContaImposto("1234-6", "Vanessa");
		banco.cadastrar(conta);
		banco.cadastrar(conta1);
		banco.creditar("1234-5", 1000);
		banco.creditar("1234-6", 1500);
		banco.transferir("1234-5", "1234-6", 500);
		banco.debitar("1234-6", 400);
		banco.creditar("1234-5", 1500);
		
		// Testando features da Conta Poupança
		ContaPoupança contap = new ContaPoupança("7777-7", "Edileudo");
		banco.cadastrar(contap);
		banco.creditar("7777-7", 1000);
		banco.renderJuros("7777-7", 0.1);
		
		// Testando features da Conta Especial
		ContaEspecial contaE = new ContaEspecial("6666-6", "Jorge");
		banco.cadastrar(contaE);
		banco.creditar("6666-6", 2000);
		banco.renderBonus("6666-6");
		
		// Testando features da Conta Imposto
		ContaImposto contaI = new ContaImposto("8888-8", "Donatelo");
		banco.cadastrar(contaI);
		banco.creditar("8888-8", 3000);
		banco.debitar("8888-8", 200);
		
		//Auditando o Banco
		auditor.auditar(banco);
		
		//Prints:
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta.getNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta.getNome() + ": " + conta.getNumero());
		System.out.println("Saldo: " + banco.saldo("1234-5"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta1.getNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta1.getNome() + ": " + conta1.getNumero());
		System.out.println("Saldo: " + banco.saldo("1234-6"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Poupança Bancária de " + contap.getNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + contap.getNome() + ": " + contap.getNumero());
		System.out.println("Saldo: " + banco.saldo("7777-7"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Especial Bancária de " + contaE.getNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + contaE.getNome() + ": " + contaE.getNumero());
		System.out.println("Saldo: " + banco.saldo("6666-6"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Imposto Bancária de " + contaI.getNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + contaI.getNome() + ": " + contaI.getNumero());
		System.out.println("Saldo: " + banco.saldo("8888-8"));
	}
}
