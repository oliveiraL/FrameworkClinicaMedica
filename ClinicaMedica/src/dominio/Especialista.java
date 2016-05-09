package dominio;

public class Especialista extends Pessoa {

	private String registro;

	private Especialidade especialidade;

	private int id;

	private String nome;

	private String CPF;

	private Atendimento atendimento;

	private AgendamentoAtendimento agendamentoAtendimento;

	
	
	
	
	
	
	
	
	/*getter and setter*/
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
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
