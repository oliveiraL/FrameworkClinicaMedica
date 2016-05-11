package dao;

import controller.GerenciarPaciente;
import dominio.Paciente;
import java.util.List;

public class PacienteDao implements GenericDao, GenericDao {

	private PacienteDao pacienteDao;

	private PacienteDao pacienteDao;

	private GerenciarPaciente gerenciarPaciente;

	public boolean existe(Paciente paciente) {
		return false;
	}


	/**
	 * @see dao.GenericDao#salvar(java.lang.Object)
	 */
	public void salvar(Object objeto) {

	}


	/**
	 * @see dao.GenericDao#atualizar(java.lang.Object)
	 */
	public Void atualizar(Object objeto) {
		return null;
	}


	/**
	 * @see dao.GenericDao#remover(int)
	 */
	public void remover(int objeto) {

	}


	/**
	 * @see dao.GenericDao#listar()
	 */
	public List listar() {
		return null;
	}


	/**
	 * @see dao.GenericDao#buscar(int)
	 */
	public Object buscar(int id) {
		return null;
	}

}
