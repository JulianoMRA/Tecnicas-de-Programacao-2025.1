package br.com.pharmasys.model.medicamento;

public abstract class Medicamento {
	protected String nome;
	protected double doseDiaria;
	protected int quantidade;
	protected String dosagem;
	
	// Construtor
	public Medicamento(String nome, double doseDiaria, int quantidade, String dosagem) {
		this.nome = nome;
		this.doseDiaria = doseDiaria;
		this.quantidade = quantidade;
		this.dosagem = dosagem;
	}
	
	// Getters e Setters
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDoseDiaria() {
        return doseDiaria;
    }

    public void setDoseDiaria(double doseDiaria) {
        this.doseDiaria = doseDiaria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }
    
    // Getter do tipo do medicamento
    public abstract String getTipo();
    
    // Método para as posologias
    public abstract String descricaoPosologia();

}
