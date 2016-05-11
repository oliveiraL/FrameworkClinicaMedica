package dominio;

import java.util.Date;
import java.util.List;

public abstract class Atendimento {

	private int id;

	private Date dataHora;

	private Paciente paciente;

	private Especialista especialista;

	private List<Tratamento> tratamentos;

	private List<DiagnosticoAtendimento>  diagnosticoAtendimentos;

	/**
	 *  
	 */
	public abstract void validarAtendimento();

}
