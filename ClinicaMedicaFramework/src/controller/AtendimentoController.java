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
    GerenciarProntuarioController gerenciarProntuario;

    public AtendimentoController() {
        gerenciarProntuario = new GerenciarProntuarioController();
        atendimentoDao = new AtendimentoPrivadoDao();
    }

    /**
     *
     * @param atendimento
     */
    public void finalizarAtendimento(Atendimento atendimento) throws ValidacaoException {
        atendimento.validarAtendimento();
        atendimentoDao.salvar((AtendimentoPrivado) atendimento);
        gerenciarProntuario.addAtendumento(atendimento);
    }
    
    public Atendimento buscarAtendimento(int ID){
        return atendimentoDao.buscarID(ID);
    }

}
