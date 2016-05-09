package ui;

import controller.Agendamento;
import dominio.Especialidade;
import dominio.Especialista;
import dominio.Paciente;

public class UIAgendamento {
	
	Agendamento agendamentoController = new Agendamento();
	
	
	
	
	
	public void agendarAtendimento(){
		agendamentoController.agendamentoAtendimento(paciente, especialista, dataHora, tipoAtendimento);
	}
	
	public void reagendarAtendimento(){}
	
	public void cancelarAtendimento(){}
	
}
