package br.ufc.dc.tpi.banco.contas;
import br.ufc.dc.tpi.banco.usuario.*;

public class Conta {
	private Usuario user;
	private String numero;
	private double saldo;
	
	public Conta(String numero, Usuario user) {
		this.numero = numero;
		this.user = user;
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
		return user.GetNome();
	}
	
	public double GetSaldo() {
		return saldo;
	}
	
	public void GetDados() {
		System.out.println("Nome: " + user.GetNome());
		System.out.println("CPF: " + user.GetCPF());
		System.out.println("RG: " + user.GetRG());
		System.out.println("Ano de Nascimento: " + user.GetAno_Nasc());
	}
}
