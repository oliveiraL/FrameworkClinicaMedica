package dominio;

import java.util.Date;

public abstract class AgendamentoAtendimento {

	private int id;

	private Date dataHora;

	private Especialista especialista;

	private Paciente paciente;

	private TipoAtendimento tipoAtendimento;

	/**
	 *  
	 */
	public abstract void validarAgendamento();

	/**
	 *  
	 */
	public abstract void verificarDisponibilidade();

}
