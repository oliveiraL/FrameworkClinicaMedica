package dominio;

public abstract class Paciente {

    private int id;

    private String nome;

    private Responsavel responsavel;

    /**
     *
     */
    public abstract void validarPaciente();

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
