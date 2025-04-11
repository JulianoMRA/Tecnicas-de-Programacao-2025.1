package BankSys;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta;
		conta = new Conta("1234-5", "Juliano");
		Conta conta1;
		conta1 = new Conta("1234-6", "Vanessa");
		conta.creditar(1000);
		conta1.creditar(2000);
		
		//Testando funcionalidades novas do Banco
		Banco banco;
		banco = new Banco();
		banco.cadastrar(conta);
		banco.cadastrar(conta1);
		banco.transferir("1234-5", "1234-6", 500);
		banco.debitar("1234-6", 400);
		banco.creditar("1234-5", 1500);
		
		
		//Prints:
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta.nome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta.nome() + ": " + conta.numero());
		System.out.println("Saldo: " + banco.saldo("1234-5"));
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta1.nome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta1.nome() + ": " + conta1.numero());
		System.out.println("Saldo: " + banco.saldo("1234-6"));
	}
}
