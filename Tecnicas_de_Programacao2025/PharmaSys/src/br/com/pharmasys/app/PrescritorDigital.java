package br.com.pharmasys.app;

import br.com.pharmasys.model.medicamento.*;
import br.com.pharmasys.model.medico.*;
import br.com.pharmasys.model.paciente.*;
import br.com.pharmasys.model.prescricao.*;

public class PrescritorDigital {

	public static void main(String[] args) {
		// Paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Juliano");
		paciente.setSobrenome("Melo Rodrigues Alencar");
		paciente.setPlano("1234567-8");
		paciente.setIdade(20);
		paciente.setCpf("622.554.853-03");
		
		// Médico
		Medico medico = new Medico();
		medico.setNome("Juliana");
		medico.setSobrenome("Melo Izaias");
		medico.setCrm("12345");
		medico.setEspecialidade("Medicina da Família");
		
		// Prescrição
		Prescricao prescricao = new Prescricao(paciente, medico);
		
		// Medicamentos
		prescricao.adicionarMedicamento(new Comprimido("Paracetamol", 3, 30, "500mg"));
		prescricao.adicionarMedicamento(new Xarope("Vick", 10, 2, "5ml"));
		prescricao.adicionarMedicamento(new Injetavel("Dipirona", 1, 1, "0,5ml"));
		
		// Printador
		System.out.println(prescricao.resumoPrescricao());
	}
}
