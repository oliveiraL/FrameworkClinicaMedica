package controller;

import ui.UiAgendamento;
import dao.AgendamentoDao;
import dominio.Paciente;
import dominio.Especialista;
import java.util.Date;
import dominio.TipoAtendimento;
import dominio.AgendamentoAtendimento;

public class AgendamentoController {

	private GerenciarPaciente gerenciarPaciente;

	private GerenciarEspecialista gerenciarEspecialista;
	private NotificarAtendimento notificarAtendimento;


	private AgendamentoDao agendamentoDao;

	public void agendamentoAt(Paciente paciente, Especialista especialista, Date dataHora, TipoAtendimento tipoAtendimento) {

	}

	/**
	 *  
	 */
	public void cancelarAtendimento(AgendamentoAtendimento agendamento) {

	}

	public void reagendarAtendimento(AgendamentoAtendimento agendamento) {

	}

	public boolean verificarAgendamento(Especialista especialista, Date dataHora) {
		return false;
	}

}
