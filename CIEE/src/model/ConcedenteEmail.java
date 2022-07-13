package model;

public class ConcedenteEmail {
	private  int id;
	private  String email;
	private TipoEmail tipo_email;
	
	
	
	public TipoEmail getTipo_email() {
		return tipo_email;
	}
	public void setTipo_email(TipoEmail tipo_email) {
		this.tipo_email = tipo_email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
