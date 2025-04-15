package BankSysArray;

public class ContaArray {
	private String numero;
	private String nome;
	private double saldo;
	
	public ContaArray(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		saldo = 0;
	}
	
	
	public void creditar (double valor) {
		saldo = saldo + valor;
	}
	public void debitar (double valor) {
		saldo = saldo - valor;
	}
	public String GetNumero() {
		return numero;
	}
	public String GetNome() {
		return nome;
	}
	public double GetSaldo() {
		return saldo;
	}
}
