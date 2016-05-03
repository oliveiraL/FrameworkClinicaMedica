package dao;

import java.util.List;

public interface GenericDao {

	public abstract void salvar(Object objeto);

	public abstract Void atualizar(Object objeto);

	public abstract void remover(int objeto);

	public abstract List listar();

	public abstract Object buscar(int id);

}
