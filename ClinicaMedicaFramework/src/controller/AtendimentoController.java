package controller;

import dao.AtendimentoPrivadoDao;
import dao.ProntuarioDao;
import dominio.Atendimento;
import dominio.AtendimentoPrivado;
import dominio.Prontuario;
import dominio.Paciente;
import validacoes.ValidacaoException;

public class AtendimentoController {

    AtendimentoPrivadoDao atendimentoDao;
    ProntuarioDao prontuarioDao;

    public AtendimentoController() {
        prontuarioDao = new ProntuarioDao();
        atendimentoDao = new AtendimentoPrivadoDao();
    }

    /**
     *
     * @param paciente
     * @return 
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
