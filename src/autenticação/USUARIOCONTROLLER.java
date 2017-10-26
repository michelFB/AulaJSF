package autenticação;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;

@ManagedBean (name="UC")
@SessionScoped
public class USUARIOCONTROLLER implements Serializable{
	/**
	 * 
	 */

	private List<USUARIOMODEL> listagem;
	 private USUARIODAO Conexao;
	 private USUARIOMODEL usuario;
	private static final long serialVersionUID = 1L;
	

// Construtor Aqui ------------------------------------------------	
	public USUARIOCONTROLLER(){	
		this.Conexao = new USUARIODAO();
		this.usuario = new USUARIOMODEL();
		this.listagem = Conexao.getLista();	
		
		/*FacesContext context = FacesContext.getCurrentInstance();
		Cookie codigo = new Cookie("Codigo", "1");
		codigo. setMaxAge(3600);
		FacesContext.getExternalContext().getResponse()).addCookie(codigo); 
		*/
	
	}
	
	
	
	// geteres e seteres -----------------------------------------
	public USUARIODAO getConexao(){
		return Conexao;
	}
	public void setConexao(USUARIODAO conexao) {
		Conexao = conexao;
	}
	public USUARIOMODEL getUsuario() {
		return usuario;
	}
	public void setUsuario(USUARIOMODEL usuario) {
		this.usuario = usuario;
	}

	//get listagem aqui!--------------------------------------------------
	 public List<USUARIOMODEL> getListagem() {
		return listagem;
	}
			 
	public String gravarUsuario() {
		Conexao.adiciona(this.usuario);	
		return "/ListaDados.xhtml";}
		
	public String apagarUsuario() {
		Conexao.apaga(this.usuario);
		return "/ListaDados.xhtml";
	}
	
	public String apagartodosUsuario() {
		Conexao.apagatodos(this.usuario);
		return "/ListaDados.xhtml";
	}
	
	public String alterarUsuario() {
		Conexao.altera(this.usuario);
		return "/ListaDados.xhtml";
	}
	
	 
}
	  

