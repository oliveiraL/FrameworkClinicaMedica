package controller;

import ui.UIGerenciarProntuario;
import dao.ProntuarioDao;
import dominio.Atendimento;
import dominio.Prontuario;
import java.util.List;
import dominio.Paciente;

public class GerenciarProntuarioController {

    private ProntuarioDao prontuarioDao;

    public GerenciarProntuarioController() {
        prontuarioDao = new ProntuarioDao();
    }

    /**
     *
     */
    public void cadastrarProntuario(Prontuario prontuario) {

    }
    public void addAtendumento(Prontuario prontuario, Atendimento atendimento){
        prontuarioDao.addAtendimento(prontuario, atendimento);
    }
    /**
     *
     */
    public void atualizarProntuario(Prontuario prontuario) {

    }

    public Prontuario removerProntuario(int prontuario) {
        return null;
    }

    public List listarProntuarios() {
        return null;
    }

    public Prontuario getProntuario(Paciente paciente) {
        return null;
    }

}
