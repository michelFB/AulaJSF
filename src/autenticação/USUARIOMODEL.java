package autenticação;

import javax.faces.validator.FacesValidator;

@FacesValidator(value = "UsuarioValidação")
public class USUARIOMODEL{
	private String codigo;
	private String login;
	private String senha;

	
	public USUARIOMODEL() {	}
	
	public USUARIOMODEL(String codigo, String login, String senha) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
	
