package controller;

import services.GenericService;
import ui.UIGerenciamentoPaciente;
import dao.PacienteDao;
import dao.ResponsavelDao;
import dominio.Paciente;
import java.util.List;

public class GerenciarPaciente {

	private GenericService genericService;

	private UIGerenciamentoPaciente uIGerenciamentoPaciente;

	private AgendamentoController agendamentoController;

	private PacienteDao pacienteDao;

	private ResponsavelDao responsavelDao;

	public void cadastrarPaciente(Paciente paciente) {

	}

	public void removerPaciene(Paciente paciente) {

	}

	public Paciente getPaciente(String CPF) {
		return null;
	}

	public List listarPacientes() {
		return null;
	}

	/**
	 *  
	 */
	public void alterarPaciente(Paciente paciente) {

	}

	public boolean verificarExistencia(Paciente paciente) {
		return false;
	}

}
