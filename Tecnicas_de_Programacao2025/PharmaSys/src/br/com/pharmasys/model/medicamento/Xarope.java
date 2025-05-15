package br.com.pharmasys.model.medicamento;

public class Xarope extends Medicamento {
	// Construtor
    public Xarope(String nome, double doseDiaria, int quantidade, String dosagem) {
        super(nome, doseDiaria, quantidade, dosagem);
    }

    public String getTipo() {
        return "Xarope";
    }

    public String descricaoPosologia() {
        return String.format("Tomar %.1f ml por dia, totalizando %d ml de %s.",
                doseDiaria, quantidade, dosagem);
    }
}
