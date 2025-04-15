package BankSysArray;

public class MainArray {
	public static void main(String[] args) {
		ContaArray conta;
		conta = new ContaArray("1234-5", "Juliano");
		ContaArray conta1;
		conta1 = new ContaArray("1234-6", "Vanessa");
		conta.creditar(1000);
		conta1.creditar(2000);
		
		//Testando funcionalidades novas do Banco
		BancoArray banco;
		banco = new BancoArray();
		banco.cadastrar(conta);
		banco.cadastrar(conta1);
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
