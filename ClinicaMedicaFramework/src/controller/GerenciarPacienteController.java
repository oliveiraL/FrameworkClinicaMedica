package controller;

import clinicaEstetica.dominio.PacienteEstetica;
import dao.PacienteDao;
import dominio.Paciente;
import java.util.ArrayList;
import validacoes.ValidacaoException;

public class GerenciarPacienteController {

    private PacienteDao pacienteDao;
    GerenciarProntuarioController gerenciarProntuario;

    public GerenciarPacienteController(String pacote) {
        pacienteDao = new PacienteDao(pacote);
        gerenciarProntuario = new GerenciarProntuarioController(pacote);
    }

    public void cadastrarPaciente(Paciente paciente) throws ValidacaoException {
        if (!paciente.getNome().isEmpty()) {
            paciente.validarPaciente();
            pacienteDao.salvar(paciente);
        }else{
            
        }
    }

    public void removerPaciene(Paciente paciente) {
        pacienteDao.remover(paciente);
    }

    public Paciente buscarPaciente(int id) throws ValidacaoException {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new ValidacaoException("Paciente não cadastrado.");
    }

    public Paciente buscarPaciente(String cpfResponsalvel) throws ValidacaoException {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        for (Paciente p : pacientes) {
            if (p.getResponsavel().getCPF().equals(cpfResponsalvel)) {
                return p;
            }
        }
        throw new ValidacaoException("Paciente não cadastrado.");
    }

    public ArrayList<Paciente> buscarPacienteResponsavel(String cpfResponsalvel) {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        ArrayList<Paciente> pacientesResposavel = new ArrayList<>();
        for (Paciente p : pacientes) {
            if (p.getResponsavel().getCPF().equals(cpfResponsalvel)) {
                pacientesResposavel.add(p);
            }
        }
        return pacientesResposavel;
    }

    public ArrayList<Paciente> buscarPacienteCPF(String CPF) {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        ArrayList<Paciente> pacientesResposavel = new ArrayList<>();
        for (Paciente p : pacientes) {
            PacienteEstetica n = (PacienteEstetica) p;
            if (n.getCPF().equals(CPF)) {
                pacientesResposavel.add(p);
            }
        }
        return pacientesResposavel;
    }

    public ArrayList<Paciente> buscarPacienteNome(String nome) throws ValidacaoException {
        ArrayList<Paciente> pacientes = pacienteDao.listar();
        ArrayList<Paciente> pacientesResposavel = new ArrayList<>();
        for (Paciente p : pacientes) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                pacientesResposavel.add(p);
            }
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
