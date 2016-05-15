package ui;

import controller.GerenciarPacienteController;
import java.util.List;

public interface UIGerenciamentoPaciente {

		/**
	 *  
	 */
	public void cadastrarPaciente();

	/**
	 *  
	 */
	public void removerPaciente();

	/**
	 *  
	 */
	public List listarPaciente();
        
        public void atualizar();
        
        

}
