package dominio;

import java.util.List;

public abstract class Prontuario {

    private int id;

    private List<Atendimento> atendimento;

    private Paciente paciente;

    public Prontuario() {
    }
    
    

    public abstract void addAtendimento(Atendimento atendimento);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Atendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(List<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
