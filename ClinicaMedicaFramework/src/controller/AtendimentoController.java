package controller;

import ui.UIAtendimento;
import dao.AtendimentoPublicDao;
import dao.AtendimentoPrivadoDao;
import dominio.Atendimento;
import dominio.AtendimentoPrivado;
import dominio.Tratamento;
import dominio.DiagnosticoAtendimento;
import dominio.Prontuario;
import dominio.Paciente;
import validacoes.ValidacaoException;

public class AtendimentoController {

    AtendimentoPrivadoDao atendimentoDao;

    public AtendimentoController() {
        atendimentoDao = new AtendimentoPrivadoDao();
    }

    /**
     *
     */
    public Prontuario consultarProntuario(Paciente paciente) {
        return null;
    }

    /**
     *
     * @param atendimento
     */
    public void finalizarAtendimento(Atendimento atendimento) throws ValidacaoException {
        atendimento.validarAtendimento();
        atendimentoDao.salvar((AtendimentoPrivado) atendimento);
    }

}
