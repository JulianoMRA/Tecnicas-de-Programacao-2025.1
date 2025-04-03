public class Endereco{
	String rua;
	int numero;
	String bairro;
	String cep;
	String cidade;
}

public class Pessoa{
	String nome;
	String cpf;
	Endereco end;
	public Pessoa(String nome, String ,cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
}
