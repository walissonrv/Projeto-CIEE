package model;

import java.util.Date;

public class Curso {
	
	private int id;
	private String nome_curso;
	private int carga_horaria_estagio;
	private Date data_cadastro;
	private Servidor servidor;
	
	
	
	public Servidor getServidor() {
		return servidor;
	}
	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_curso() {
		return nome_curso;
	}
	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}
	public int getCarga_horaria_estagio() {
		return carga_horaria_estagio;
	}
	public void setCarga_horaria_estagio(int carga_horaria_estagio) {
		this.carga_horaria_estagio = carga_horaria_estagio;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
	

}
