package br.com.pharmasys.model.prescricao;

import br.com.pharmasys.model.medicamento.*;
import br.com.pharmasys.model.medico.*;
import br.com.pharmasys.model.paciente.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prescricao {
	private Paciente paciente;
	private Medico medico;
	private List<Medicamento> medicamentos;
	
	// Construtor
	public Prescricao(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = new ArrayList<>();
    }
	
	// Getters
	public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }
    
    public List<Medicamento> getMedicamentos() {
        return Collections.unmodifiableList(medicamentos);
    }
    
    // Adicionando e removendo Medicamentos
    public void adicionarMedicamento(Medicamento medicamento) {
        if (medicamento != null) {
            medicamentos.add(medicamento);
        } else {
        	System.out.println("Medicamento inválido!");
        }
    }
    
    public boolean removerMedicamento(Medicamento medicamento) {
        return medicamentos.remove(medicamento);
    }
    
    // Printador da Prescrição (GPT)
    public String resumoPrescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente: ").append(paciente.getNome()).append(" ").append(paciente.getSobrenome()).append("\n");
        sb.append("Médico: ").append(medico.getNome()).append(" ").append(medico.getSobrenome()).append("\n");
        sb.append("Medicamentos prescritos:\n");
        for (Medicamento med : medicamentos) {
            sb.append("- ").append(med.getTipo()).append(": ").append(med.getNome()).append("\n");
            sb.append("  Posologia: ").append(med.descricaoPosologia()).append("\n");
        }
        return sb.toString();
    }
}
