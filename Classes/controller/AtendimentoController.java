package controller;

import ui.UIAtendimento;
import dao.AtendimentoPublicDao;
import dao.AtendimentoPrivadoDao;
import dominio.Tratamento;
import dominio.DiagnosticoAtendimento;
import dominio.Prontuario;
import dominio.Paciente;

public class AtendimentoController {

	private UIAtendimento uIAtendimento;

	private AtendimentoPublicDao atendimentoPublicDao;

	private AtendimentoPrivadoDao atendimentoPrivadoDao;

	private PagamentoAtendimento pagamentoAtendimento;

	/**
	 *  
	 */
	public Tratamento preescreverTratamento() {
		return null;
	}

	/**
	 *  
	 */
	public DiagnosticoAtendimento preescrecerDiagnostico() {
		return null;
	}

	public Prontuario consultarProntuario(Paciente paciente) {
		return null;
	}

	/**
	 *  
	 */
	public void finalizarAtendimento() {

	}

}
