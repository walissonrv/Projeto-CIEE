package controller;

import java.util.List;

public interface IController<X> {
	public abstract boolean salvar(X modelo);
	public abstract boolean alterar(X modelo);
	public abstract boolean excluir(X modelo);
	public abstract boolean buscar(X modelo);
	public abstract  X buscar(int id);
	public abstract  List<X> buscarTodos();
	
	

}
