package ui;

import controller.GerenciarPlanosDeSaude;

public interface UIGerenciarPlanoDeSaude {

	private GerenciarPlanosDeSaude gerenciarPlanosDeSaude;

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
