package controller;

import dao.PacienteDao;
import dominio.Paciente;
import java.util.ArrayList;
import validacoes.ValidacaoException;

public class GerenciarPacienteController {

    private PacienteDao pacienteDao;
    GerenciarProntuarioController gerenciarProntuario;

    public GerenciarPacienteController() {
        pacienteDao = new PacienteDao("xmlVeterinaria");
        gerenciarProntuario = new GerenciarProntuarioController();
    }
    
    
    
    public void cadastrarPaciente(Paciente paciente) throws ValidacaoException {
        paciente.validarPaciente();
        pacienteDao.salvar(paciente);
    }

    public void removerPaciene(Paciente paciente){
        pacienteDao.remover(paciente);
    }

    public Paciente buscarPaciente(int id) throws ValidacaoException {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        for(Paciente p: pacientes){
            if(p.getId() == id)
                return p;
        }
        throw new ValidacaoException("Paciente não cadastrado.");
    }
    
    public Paciente buscarPaciente(String cpfResponsalvel) throws ValidacaoException {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        for(Paciente p: pacientes){
            if(p.getResponsavel().getCPF().equals(cpfResponsalvel))
                return p;
        }
        throw new ValidacaoException("Paciente não cadastrado.");
    }
    
   

    public ArrayList<Paciente> buscarPacienteResponsavel(String cpfResponsalvel){
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        ArrayList<Paciente> pacientesResposavel = new ArrayList<>();
        for(Paciente p: pacientes){
            if(p.getResponsavel().getCPF().equals(cpfResponsalvel))
                pacientesResposavel.add(p);
        }
        return pacientesResposavel;
    }
    
    
    public ArrayList<Paciente> listarPacientes() {
        System.err.println(pacienteDao.caminho);
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
