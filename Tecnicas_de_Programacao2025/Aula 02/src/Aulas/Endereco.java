package Aulas;

public class Endereco{
	String rua;
	int numero;
	String bairro;
	String cep;
	String cidade;
	
	public Endereco(String rua, int numero, String bairro, 
			String cep, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	public String toString() {
		return rua + ", " + numero + " - " + bairro + 
				", " + cidade + " - CEP: " + cep;
	}
}
