package dominio;

import java.util.Date;
import java.util.Collection;

public class Atendimento {

	private int id;

	private Date dataHora;

	private Paciente paciente;

	private Especialista especialista;

	private Collection<Tratamento> tratamento;

	private Prontuario prontuario;

	private TipoAtendimento tipoAtendimento;

}
