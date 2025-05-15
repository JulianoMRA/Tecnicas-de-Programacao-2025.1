package br.com.pharmasys.model.medicamento;

public class Comprimido extends Medicamento{
	// Construtor
	public Comprimido(String nome, double doseDiaria, int quantidade, String dosagem) {
		super(nome, doseDiaria, quantidade, dosagem);
	}

	public String getTipo() {
		return "Comprimido";
	}

	public String descricaoPosologia() {
		return String.format("Tomar %.0f comprimidos por dia, totalizando %d comprimidos de %s cada.",
                doseDiaria, quantidade, dosagem);
	}
	
}
