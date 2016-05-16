package controller;

import dao.EspecialistaDao;
import dominio.Especialista;
import java.util.List;
import validacoes.ValidacaoException;

public class GerenciarEspecialistaController {

    private EspecialistaDao especialistaDao;
   

    public GerenciarEspecialistaController() {
        especialistaDao = new EspecialistaDao();
    }

    /**
     *
     */
    public void cadastrarEspecialista(Especialista especialista) throws ValidacaoException {
        especialista.validarEspecialista();
    }

    /**
     *
     */
    public void removerEspecialista(Especialista especialista) {

    }

    public Especialista getEspecialista(String CPF) {
        return null;
    }

    public List listarEspecialista() {
        return null;
    }

    /**
     *
     */
    public void alterarEspecialista(Especialista especialista) {

    }

    public boolean verificarExistencia(Especialista especialista) {
        return false;
    }

}
