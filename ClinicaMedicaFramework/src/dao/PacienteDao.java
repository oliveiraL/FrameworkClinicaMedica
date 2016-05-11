package dao;

import controller.GerenciarPaciente;
import dominio.Paciente;
import java.util.List;

public abstract class PacienteDao extends GenericDao<Paciente>{

	private PacienteDao pacienteDao;


	private GerenciarPaciente gerenciarPaciente;

	public boolean existe(Paciente paciente) {
		return false;
	}


}
