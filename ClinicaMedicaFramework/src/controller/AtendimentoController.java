package controller;

import dao.AtendimentoDao;
import dao.ProntuarioDao;
import dominio.Atendimento;
import dominio.AtendimentoPrivado;
import dominio.Prontuario;
import dominio.Paciente;
import validacoes.ValidacaoException;

public class AtendimentoController {

    AtendimentoDao atendimentoDao;
    GerenciarProntuarioController gerenciarProntuario;

    public AtendimentoController() {
        gerenciarProntuario = new GerenciarProntuarioController();
        atendimentoDao = new AtendimentoDao("xmlVeterinaria");
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
