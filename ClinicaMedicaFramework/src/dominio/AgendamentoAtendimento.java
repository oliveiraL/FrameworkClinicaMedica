package dominio;

import java.util.Date;
import validacoes.ValidacaoException;

public abstract class AgendamentoAtendimento {

    private int id;

    private Date dataHora;

    private Especialista especialista;

    private Paciente paciente;

    private Especialidade especialidade;

    public AgendamentoAtendimento() {
    }

    public AgendamentoAtendimento(Date dataHora, Especialista especialista, Paciente paciente, Especialidade especialidade) {
        
        this.dataHora = dataHora;
        this.especialista = especialista;
        this.paciente = paciente;
        this.especialidade = especialidade;
    }

    
    
    /**
     *
     */
    public abstract void validarAgendamento()throws ValidacaoException;

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

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

}
