package BankSys;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta;
		conta = new Conta("1234-5", "Juliano");
		Conta conta1;
		conta1 = new Conta("1234-6", "Matias");
		if(conta.nome().equals(conta1.nome())) {
			System.out.println("NOME IGUAL");
		}
		System.out.println("Conta Bancária de " + conta.nome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de Conta de " + conta.nome() + ": " + conta.numero());
		System.out.println("Saldo: " + conta.saldo());
	}
}
