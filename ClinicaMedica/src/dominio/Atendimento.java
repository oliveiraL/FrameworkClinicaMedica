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

	
	
	
	
	
	/*setter and getter*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}

	public Collection<Tratamento> getTratamento() {
		return tratamento;
	}

	public void setTratamento(Collection<Tratamento> tratamento) {
		this.tratamento = tratamento;
	}

	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}

	public TipoAtendimento getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}
	
	

}
