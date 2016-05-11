package dao;

import controller.GerenciarProntuario;
import dominio.Prontuario;
import dominio.Paciente;
import java.util.List;

public class ProntuarioDao implements GenericDao {

	private GerenciarProntuario gerenciarProntuario;

	public Prontuario buscar(Paciente paciente) {
		return null;
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
