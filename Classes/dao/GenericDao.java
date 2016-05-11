package dao;

import services.GenericService;
import java.util.List;

public interface GenericDao {

	private GenericService genericService;

	public abstract void salvar(Object objeto);

	public abstract Void atualizar(Object objeto);

	public abstract void remover(int objeto);

	public abstract List listar();

	public abstract Object buscar(int id);

}
