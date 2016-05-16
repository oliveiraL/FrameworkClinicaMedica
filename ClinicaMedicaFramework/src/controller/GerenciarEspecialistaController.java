package controller;

import dao.EspecialistaDao;
import dominio.Especialista;
import java.util.ArrayList;
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
        especialistaDao.salvar(especialista);
    }

    /**
     *
     */
    public void removerEspecialista(Especialista especialista) {
        especialistaDao.remover(especialista);
    }

    public Especialista getEspecialista(String CPF) {
        return null;
    }

    public ArrayList<Especialista> listarEspecialista() {
        return especialistaDao.listar();
    }

    /**
     *
     */
    public void atualizarEspecialista(Especialista especialista) {
        especialistaDao.atualizar(especialista);
    }

    public boolean verificarExistencia(Especialista especialista) {
        return false;
    }

}
