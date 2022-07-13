package model;

import java.util.Date;

public class RegistroEstagio  {
	private int id;
	private int numero_registro;
	private int ano;
	private Date data_registro;
	private String observacao;
	private Date data_cadastro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero_registro() {
		return numero_registro;
	}
	public void setNumero_registro(int numero_registro) {
		this.numero_registro = numero_registro;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Date getData_registro() {
		return data_registro;
	}
	public void setData_registro(Date data_registro) {
		this.data_registro = data_registro;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	

}
