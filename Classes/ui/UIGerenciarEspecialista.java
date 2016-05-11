package ui;

import controller.GerenciarEspecialista;

public interface UIGerenciarEspecialista {

	private GerenciarEspecialista gerenciarEspecialista;

	public abstract void cadastrarEspecialista();

	public abstract void removerEspecialista();

	public abstract void listarEspecialista();

}
