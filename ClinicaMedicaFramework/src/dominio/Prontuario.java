package dominio;

import java.util.List;

public abstract class Prontuario {

	private int id;

	private List<Atendimento> atendimento;

	private Paciente paciente;

	public abstract void addAtendimento(Atendimento atendimento);

}
