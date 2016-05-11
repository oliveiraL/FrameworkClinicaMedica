package dao;

import controller.AgendamentoController;
import dominio.AgendamentoAtendimento;
import dominio.Especialista;
import java.util.Date;

public abstract class AgendamentoDao extends GenericDao<AgendamentoAtendimento> {

	private AgendamentoController agendamentoController;

	public abstract boolean verificarAgendamento(Especialista especialista, Date dataHora);

}
