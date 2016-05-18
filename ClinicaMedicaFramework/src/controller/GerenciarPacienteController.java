package controller;

import dao.PacienteDao;
import dominio.Paciente;
import java.util.ArrayList;
import java.util.List;
import validacoes.ValidacaoException;

public class GerenciarPacienteController {

    private PacienteDao pacienteDao;

    public GerenciarPacienteController() {
        pacienteDao = new PacienteDao();
    }
    
    
    
    public void cadastrarPaciente(Paciente paciente) throws ValidacaoException {
        paciente.validarPaciente();
        pacienteDao.salvar(paciente);
    }

    public void removerPaciene(Paciente paciente) {
        pacienteDao.remover(paciente);
    }

    public Paciente buscarPaciente(int id) {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        for(Paciente p: pacientes){
            if(p.getId() == id)
                return p;
        }
        return null;
    }
    
    public Paciente buscarPaciente(String cpfResponsalvel) {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        for(Paciente p: pacientes){
            if(p.getResponsavel().getCPF().equals(cpfResponsalvel))
                return p;
        }
        return null;
    }

    public ArrayList<Paciente> listarPacientes() {
        return pacienteDao.listar();
    }

    /**
     *
     * @param paciente
     * @throws validacoes.ValidacaoException
     */
    public void alterarPaciente(Paciente paciente) throws ValidacaoException {
        paciente.validarPaciente();
        pacienteDao.atualizar(paciente);
    }

    public boolean verificarExistencia(Paciente paciente) {
        return pacienteDao.existe(paciente);
    }

}
