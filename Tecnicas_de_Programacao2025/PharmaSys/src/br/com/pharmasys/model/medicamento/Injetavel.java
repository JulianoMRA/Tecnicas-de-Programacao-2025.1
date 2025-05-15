package br.com.pharmasys.model.medicamento;

public class Injetavel extends Medicamento {
	// Construtor
    public Injetavel(String nome, double doseDiaria, int quantidade, String dosagem) {
        super(nome, doseDiaria, quantidade, dosagem);
    }

    public String getTipo() {
        return "Injetável";
    }

    public String descricaoPosologia() {
        return String.format("Aplicar %.0f ampolas por dia, totalizando %d ampolas de %s cada.",
                doseDiaria, quantidade, dosagem);
    }
}
