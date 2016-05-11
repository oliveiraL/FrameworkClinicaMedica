package dominio;

public class TipoAtendimento {

	private int id;

	private String descricao;

	private Atendimento atendimento;

	private AgendamentoAtendimento agendamentoAtendimento;

	
	
	
	
	/* getter and setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public AgendamentoAtendimento getAgendamentoAtendimento() {
		return agendamentoAtendimento;
	}

	public void setAgendamentoAtendimento(AgendamentoAtendimento agendamentoAtendimento) {
		this.agendamentoAtendimento = agendamentoAtendimento;
	}
	
	

}
