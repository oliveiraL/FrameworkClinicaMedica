package controller;

import clinicaVeterinaria.dominio.Agendamento;
import ui.UiAgendamento;
import dao.AgendamentoDao;
import dominio.Paciente;
import dominio.Especialista;
import java.util.Date;
import dominio.TipoAtendimento;
import dominio.AgendamentoAtendimento;
import dominio.Especialidade;
import java.util.ArrayList;
import validacoes.ValidacaoException;

public class AgendamentoController {

    private GerenciarPacienteController gerenciarPaciente;

    private GerenciarEspecialistaController gerenciarEspecialista;
    
    private NotificarAtendimento notificarAtendimento;

    private AgendamentoDao agendamentoDao;

    public AgendamentoController() {
    }

    public void agendamento(Paciente paciente, Especialista especialista, Date dataHora, Especialidade especialidade) throws ValidacaoException {
        AgendamentoAtendimento agendamento = new Agendamento(dataHora, especialista, paciente, especialidade);
        agendamento.validarAgendamento();
        verificarAgendamento(especialista, dataHora);
        agendamentoDao.salvar(agendamento);
        notificarAtendimento.notificarAgendamento(agendamento);
    }

    /**
     *
     * @param agendamento
     */
    public void cancelarAtendimento(AgendamentoAtendimento agendamento) {
        agendamentoDao.remover(agendamento);
    }

    public void reagendarAtendimento(AgendamentoAtendimento agendamento) {
        agendamentoDao.atualizar(agendamento);
    }

    public boolean verificarAgendamento(Especialista especialista, Date dataHora) {
        ArrayList<AgendamentoAtendimento> agendamentos = agendamentoDao.listar();
        for (AgendamentoAtendimento agendamento : agendamentos) {
            if (agendamento.getEspecialista() == especialista && agendamento.getDataHora() == dataHora) {
                return false;
            }
        }
        return true;
    }

}
