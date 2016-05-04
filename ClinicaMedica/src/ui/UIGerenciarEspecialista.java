package ui;

import java.awt.List;

import dominio.Especialista;

public interface UIGerenciarEspecialista {
	public abstract void cadastrarEspecialista(Especialista especialista);

	public abstract void removerEspecialista(Especialista especialista);

	public abstract void listarEspecialista(List especialista);
}
