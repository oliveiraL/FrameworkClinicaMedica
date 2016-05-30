package controller;

import dominio.Notificacao;
import dominio.AgendamentoAtendimento;

public class NotificarAtendimento {

    private Notificacao notificacao;

    public NotificarAtendimento() {
    }

    public NotificarAtendimento(Notificacao notificacao) {
        this.notificacao = notificacao;
    }
    
    

    /**
     *
     */
    public void notificarAgendamento(AgendamentoAtendimento agendamento) {
        notificacao.enviar();
    }

    public void notificarCandelamento(AgendamentoAtendimento agendamento) {
        notificacao.enviar();
    }

}
