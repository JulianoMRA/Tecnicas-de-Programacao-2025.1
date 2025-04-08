package Aulas;

public class Main {
	public static void main(String args[]) {
		Endereco e = new Endereco("Rua Rodrigues Júnior", 921, "Centro", "60060-000", "Fortaleza");
		Pessoa p = new Pessoa("Juliano", "123.456.789-00", e);
		System.out.println("Nome: " + p.getNome());
		System.out.println("CPF: " + p.getCPF());
		System.out.println("Endereço: " + p.getEnd());
	}
}
