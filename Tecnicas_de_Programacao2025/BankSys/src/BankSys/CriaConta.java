package BankSys;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta;
		conta = new Conta("1234-5", "Juliano");
		conta.creditar(1376.98);
		conta.debitar(287.54);
		System.out.println("Conta Bancária de " + conta.nome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de Conta: " + conta.numero());
		System.out.println("Saldo: " + conta.saldo());
	}
}
