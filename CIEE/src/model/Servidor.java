package model;

import java.util.Date;

public class Servidor {
	
	private  int    id;
	private  String nome;
	private  int    matricula;
	private  String email;
	private  Date   data_cadastro;
	private TipoServidor tipo_servidor;
	private ServidorTelefone servidor_telefone;
	private Curso curso;
	private Cidade cidade;
	
	
	
	
	public TipoServidor getTipo_servidor() {
		return tipo_servidor;
	}
	public void setTipo_servidor(TipoServidor tipo_servidor) {
		this.tipo_servidor = tipo_servidor;
	}
	public ServidorTelefone getServidor_telefone() {
		return servidor_telefone;
	}
	public void setServidor_telefone(ServidorTelefone servidor_telefone) {
		this.servidor_telefone = servidor_telefone;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
	
	

}
