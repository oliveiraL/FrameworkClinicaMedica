package dominio;

import controller.NotificarAtendimento;

public abstract class Notificacao {

    private String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract void enviar();

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
