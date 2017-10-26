package autenticação;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class USUARIODAO {
	private Connection connection;
	private List<USUARIOMODEL> UsuarioLista;
	
	//construtor ------------------------------------------------------------------------------
	public USUARIODAO() {
	// abre uma conexão com o banco de dados
	this.connection = new BANCO().getConnection();
	}
		
	
	// método de adicionar ao banco ------------------------------------------------------------
	public void adiciona(USUARIOMODEL Usuario) {	
	try {
	// prepared statement para inserção
	String sql = "insert into USUARIO " + "(CODIGO, LOGIN, SENHA)" + " values (?,?,?)";	
	PreparedStatement st = connection.prepareStatement(sql);	
	// seta os valores
	st.setString(1, Usuario.getCodigo());
	st.setString(2, Usuario.getLogin());
	st.setString(3, Usuario.getSenha());
	// executa
	st.execute();
	st.close();
	} catch (SQLException e) {
	throw new RuntimeException(e);	}
	}

//apagar-----------------------------------------------------------------------------------------------------
public void apaga(USUARIOMODEL usuario) {
	try {
		// prepared statement para inserção
		PreparedStatement st = connection.prepareStatement("DELETE FROM USUARIO WHERE CODIGO = ?;");
		st.setString(1, usuario.getCodigo());
		st.execute();
		st.close();
		} catch (SQLException e) {
		throw new RuntimeException(e);	}
		}

public void apagatodos(USUARIOMODEL usuario) {
	try {
		// prepared statement para inserção
		PreparedStatement st = connection.prepareStatement("DELETE FROM USUARIO;");
		st.execute();
		st.close();
		} catch (SQLException e) {
		throw new RuntimeException(e);	}
		}

public void altera(USUARIOMODEL usuario) {
	try {
			PreparedStatement st = connection.prepareStatement("UPDATE USUARIO SET LOGIN = ?, SENHA = ? WHERE CODIGO = ?;");
			st.setString(1, usuario.getLogin());
			st.setString(2, usuario.getSenha());
			st.setInt(3, Integer.parseInt(usuario.getCodigo()));
			st.execute();
			st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
}
//listando----------------------------------------------------------------------------------------------
	public List<USUARIOMODEL> getLista() {
		try {
			this.UsuarioLista =new ArrayList<USUARIOMODEL>();
			PreparedStatement stmt = this.connection.
			prepareStatement("select * from USUARIO");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
// criando o objeto Contato
				USUARIOMODEL UsuarioObj = new USUARIOMODEL();
				UsuarioObj.setCodigo(rs.getString("CODIGO"));
				UsuarioObj.setLogin(rs.getString("LOGIN"));
				UsuarioObj.setSenha(rs.getString("SENHA"));		
// adicionando o objeto à lista
				UsuarioLista.add(UsuarioObj);
				}
			rs.close();
			stmt.close();
						} catch (SQLException e) {
				throw new RuntimeException(e);
				}
		return UsuarioLista;
	}
	
}

/* facs config
<navigation-rule>
	<from-view-id>/InserirDados.xhtml </from-view-id>
	<navigation-case>
 	<from-outcome>lista</from-outcome>
 	<to-view-id>/ListaDados.xhtml</to-view-id>
 	</navigation-case>
 	</navigation-rule>
    
    <navigation-rule>
	<from-view-id>/ListaDados.xhtml </from-view-id>
	<navigation-case>
 	<from-outcome>grava</from-outcome>
 	<to-view-id>/InserirDados.xhtml</to-view-id>
 	</navigation-case>
 	</navigation-rule>
 */ 
