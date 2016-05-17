package dominio;

public class Especialidade {

    private int id;

    private String descricao;
    
    private String designacao;

    public Especialidade(String descricao, String designacao) {
        this.descricao = descricao;
        this.designacao = designacao;
    }

   
    
    public Especialidade() {
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

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

}
