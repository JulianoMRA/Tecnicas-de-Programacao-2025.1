package BankSys;

public class CriaConta {

	public static void main(String[] args) {
		Conta c = new Conta("1234-5");
		c.creditar(666);
		System.out.println("Número de Conta: " + c.numero());
		System.out.println("Saldo: " + c.saldo());
	}
}
