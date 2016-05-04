package ui;

import java.awt.List;

import dominio.Paciente;

public interface UIGerenciamentoPaciente {
	public abstract void cadastrarPaciente(Paciente paciente);

	public abstract void removerPaciente(Paciente paciente);

	public abstract void listarPaciente(List paciente);
}
