package dominio;

import validacoes.ValidacaoException;

public abstract class Paciente {

    private int id;

    private String nome;

    private Responsavel responsavel;

    public Paciente(String nome, Responsavel responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public Paciente() {
    }
    
    
    /**
     *
     */
    public abstract void validarPaciente() throws ValidacaoException;

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

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

}
