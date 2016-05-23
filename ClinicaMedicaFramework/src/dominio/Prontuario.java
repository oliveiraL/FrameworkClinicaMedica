package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Prontuario {

    private int id;

    private ArrayList<Atendimento> atendimento;

    private Paciente paciente;

    
    public Prontuario() {
        atendimento = new ArrayList<>();
    }
    
    

    public abstract void addAtendimento(Atendimento atendimento);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Atendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(ArrayList<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
