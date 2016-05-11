package dao;

import controller.AtendimentoController;
import java.util.List;

public class AtendimentoPrivadoDao implements GenericDao, GenericDao {

	private AtendimentoController atendimentoController;

	public List listarAtendimentoNaoPago() {
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
