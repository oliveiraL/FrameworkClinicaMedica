package dao;


import java.util.List;

public abstract class GenericDao<T> {
        private T t;

	public abstract void salvar(T t);

	public abstract Void atualizar(T t);

	public abstract void remover(T t);

	public abstract List<T> listar();

	public abstract T buscar(T t);

}
