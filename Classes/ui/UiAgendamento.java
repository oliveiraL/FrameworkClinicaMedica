package ui;

import controller.AgendamentoController;

public interface UiAgendamento {

	private AgendamentoController agendamentoController;

	/**
	 *  
	 */
	public void agendar();

	public void reagendar();

	/**
	 *  
	 */
	public void cancelar();

}
