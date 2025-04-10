package BankSys;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta;
		conta = new Conta("12.345-6");
		conta.creditar(72148.76);
		conta.debitar(9082.82);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de conta: "+ conta.numero());
		System.out.println("Saldo: " + conta.saldo());
	}
}
