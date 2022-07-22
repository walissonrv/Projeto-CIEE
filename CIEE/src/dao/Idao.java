package dao;

import java.util.List;

import model.Aluno;



public interface Idao <T extends Aluno >{
	public abstract boolean salvar(T m);
	public abstract boolean alterar(T m);
	public abstract boolean excluir(T m);
	public abstract boolean buscar(T m);
	public abstract T buscar(int id);
	public abstract List<T> buscarTodos();
}

