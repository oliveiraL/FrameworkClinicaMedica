package dominio;

public class Especialidade {

    private int id;

    private String descricao;

    private TipoAtendimento tipoAtendimento;

    
    
    public Especialidade() {
    }

    public Especialidade(String descricao, TipoAtendimento tipoAtendimento) {
        this.descricao = descricao;
        this.tipoAtendimento = tipoAtendimento;
    }
    
    
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

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
}
