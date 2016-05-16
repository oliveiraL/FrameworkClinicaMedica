package dominio;

import validacoes.ValidacaoException;

public abstract class Especialista {

    private Especialidade especialidade;

    private int id;

    private String nome;

    private String CPF;

    public Especialista() {
    }

    public Especialista(Especialidade especialidade, String nome, String CPF) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.CPF = CPF;
    }
    
    /**
     *
     */
    public abstract void validarEspecialista() throws ValidacaoException;

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

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
