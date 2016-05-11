package ui;

import controller.GerenciarProntuario;

public interface UIGerenciarProntuario {

	private GerenciarProntuario gerenciarProntuario;

	/**
	 *  
	 */
	public abstract void cadastrar();

	/**
	 *  
	 */
	public abstract void visualizar();

	/**
	 *  
	 */
	public abstract void atualizar();

}
