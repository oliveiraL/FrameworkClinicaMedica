package dominio;

import java.util.Date;
import java.util.List;
import validacoes.ValidacaoException;

public abstract class Atendimento {

    protected int id;

    protected Date dataHora;

    protected Paciente paciente;

    protected Especialista especialista;

    protected Tratamento tratamentos;

    protected DiagnosticoAtendimento diagnosticoAtendimentos;

    public Atendimento() {
    }

    /**
     *
     *
     */
    public abstract void validarAtendimento()throws ValidacaoException;

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

    public Tratamento getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(Tratamento tratamentos) {
        this.tratamentos = tratamentos;
    }

    public DiagnosticoAtendimento getDiagnosticoAtendimentos() {
        return diagnosticoAtendimentos;
    }

    public void setDiagnosticoAtendimentos(DiagnosticoAtendimento diagnosticoAtendimentos) {
        this.diagnosticoAtendimentos = diagnosticoAtendimentos;
    }

    

}
