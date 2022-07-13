package model;

import java.util.Date;

public class Aluno {
	private  int id;
	private  String nome;
	private  int numero_matricula;
	private  String email;
	private  Date data_cadastro;
	private Cidade cidade;
	private AlunoTelefone aluno_telefone;
	private Curso curso;
	
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public AlunoTelefone getAluno_telefone() {
		return aluno_telefone;
	}
	public void setAluno_telefone(AlunoTelefone aluno_telefone) {
		this.aluno_telefone = aluno_telefone;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
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
	public int getNumero_matricula() {
		return numero_matricula;
	}
	public void setNumero_matricula(int numero_matricula) {
		this.numero_matricula = numero_matricula;
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
