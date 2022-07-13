package model;

import java.util.Date;

public class Concedente {
	private int id;
	private int numero_covenio;
	private String razao_social;
	private String nome_fantasia;
	private String responsavel_estagio;
	private String supervisor_estagio;
	private Date   inicio_convenio;
	private Date   fim_convenio;
	private Date   data_cadastro;
	private ConcedenteTelefone concedente_telefone;
	private ConcedenteEmail concedente_email;
	private Cidade cidade;
	
	
	
	
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public ConcedenteTelefone getConcedente_telefone() {
		return concedente_telefone;
	}
	public void setConcedente_telefone(ConcedenteTelefone concedente_telefone) {
		this.concedente_telefone = concedente_telefone;
	}
	public ConcedenteEmail getConcedente_email() {
		return concedente_email;
	}
	public void setConcedente_email(ConcedenteEmail concedente_email) {
		this.concedente_email = concedente_email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero_covenio() {
		return numero_covenio;
	}
	public void setNumero_covenio(int numero_covenio) {
		this.numero_covenio = numero_covenio;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	public String getResponsavel_estagio() {
		return responsavel_estagio;
	}
	public void setResponsavel_estagio(String responsavel_estagio) {
		this.responsavel_estagio = responsavel_estagio;
	}
	public String getSupervisor_estagio() {
		return supervisor_estagio;
	}
	public void setSupervisor_estagio(String supervisor_estagio) {
		this.supervisor_estagio = supervisor_estagio;
	}
	public Date getInicio_convenio() {
		return inicio_convenio;
	}
	public void setInicio_convenio(Date inicio_convenio) {
		this.inicio_convenio = inicio_convenio;
	}
	public Date getFim_convenio() {
		return fim_convenio;
	}
	public void setFim_convenio(Date fim_convenio) {
		this.fim_convenio = fim_convenio;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
	
	
	

}
