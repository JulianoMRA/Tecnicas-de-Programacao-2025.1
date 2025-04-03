package Aulas;

public class Main {
	public static void main(String args[]) {
		Pessoa p = new Pessoa("Juliano", "123.456.789-00");
		System.out.println(p.getNome());
		System.out.println(p.getCPF());
	}
}
