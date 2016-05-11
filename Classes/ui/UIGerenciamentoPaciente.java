package ui;

import controller.GerenciarPaciente;
import java.util.List;

public interface UIGerenciamentoPaciente {

	private GerenciarPaciente gerenciarPaciente;

	/**
	 *  
	 */
	public abstract void cadastrarPaciente();

	/**
	 *  
	 */
	public abstract void removerPaciente();

	/**
	 *  
	 */
	public abstract List listarPaciente();

}
