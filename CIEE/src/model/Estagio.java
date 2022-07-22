package model;

import java.util.Date;

public class Estagio   {
	private int id;
	private int modalidade_estagio;
	private Date data_inicio;
	private Date data_fim;
	private Date  data_previsao_entrega;
	private Date data_cadastro;
	private RegistroEstagio registro_estagio;
	private EncerramentoEstagio encerramento_estagio;
	private Concedente concendente;
	private AgenteMediador agente_mediador;
	private Aluno aluno;
	private Servidor servidor;
	
	
	
	
	
	public Servidor getServidor() {
		return servidor;
	}
	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public AgenteMediador getAgente_mediador() {
		return agente_mediador;
	}
	public void setAgente_mediador(AgenteMediador agente_mediador) {
		this.agente_mediador = agente_mediador;
	}
	public Concedente getConcendente() {
		return concendente;
	}
	public void setConcendente(Concedente concendente) {
		this.concendente = concendente;
	}
	public RegistroEstagio getRegistro_estagio() {
		return registro_estagio;
	}
	public void setRegistro_estagio(RegistroEstagio registro_estagio) {
		this.registro_estagio = registro_estagio;
	}
	public EncerramentoEstagio getEncerramento_estagio() {
		return encerramento_estagio;
	}
	public void setEncerramento_estagio(EncerramentoEstagio encerramento_estagio) {
		this.encerramento_estagio = encerramento_estagio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModalidade_estagio() {
		return modalidade_estagio;
	}
	public void setModalidade_estagio(int modalidade_estagio) {
		this.modalidade_estagio = modalidade_estagio;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
	
	public Date getData_previsao_entrega() {
		return data_previsao_entrega;
	}
	public void setData_previsao_entrega(Date data_previsao_entrega) {
		this.data_previsao_entrega = data_previsao_entrega;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

}
