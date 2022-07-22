package model;

public class AlunoTelefone {
	
	private int id;
	private String telefone;
	private TipoTelefone tipo_telefone;
	
	
	
	public TipoTelefone getTipo_telefone() {
		return tipo_telefone;
	}
	public void setTipo_telefone(TipoTelefone tipo_telefone) {
		this.tipo_telefone = tipo_telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
