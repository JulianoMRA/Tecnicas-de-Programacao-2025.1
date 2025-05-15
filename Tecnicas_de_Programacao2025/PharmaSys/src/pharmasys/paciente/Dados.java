package pharmasys.paciente;

public class Dados {
	public String nome;
	public String sobrenome;
	public String CPF;
	public String plano;
	public int idade;
	public String endereço;
	
	public Dados(String nome, String sobrenome, String CPF, String plano, int idade, String endereço) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
		this.plano = plano;
		this.idade = idade;
		this.endereço = endereço;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public String getPlano() {
		return plano;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getEndereço() {
		return endereço;
	}
}
