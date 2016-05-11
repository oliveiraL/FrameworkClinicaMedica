package dao;

import controller.AgendamentoController;
import dominio.Especialista;
import java.util.Date;
import java.util.List;

public class AgendamentoDao implements GenericDao, GenericDao {

	private AgendamentoController agendamentoController;

	public abstract boolean verificarAgendamento(Especialista especialista, Date dataHora);


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
