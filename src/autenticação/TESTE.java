package autenticação;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import autenticação.USUARIOMODEL;
import autenticação.USUARIODAO;

public class TESTE {


public static void main(String[] args) throws SQLException, ClassNotFoundException {


	USUARIODAO Conexao = new USUARIODAO();
	List<USUARIOMODEL> UsuarioLista = Conexao.getLista();
	
	for (USUARIOMODEL Us : UsuarioLista) {
		System.out.println("Nome: " + Us.getCodigo());
		System.out.println("Login: " + Us.getLogin());
		System.out.println("Senha: " + Us.getSenha());		}
	
	/*//ABRINDO UMA CONEXÃO E ADICIONANDO UM REGISTRO
	USUARIOBEAN Usuario = new USUARIOBEAN();
		
	Usuario.setCodigo("1");
	Usuario.setLogin("Michel");
	Usuario.setSenha("1234");
	// ABRE UMA CONEXÃO!!!
	USUARIODAO Conexao = new USUARIODAO();
	// GRAVA COM USO DESSE MÉTODO
	Conexao.adiciona(Usuario);
	System.out.println("Gravado!");
	*/
	
	

	/*//PRIMEIRO EXEMPLO ABRINDO UMA CONEXÃO
	Connection connection = new BANCO().getConnection();
	System.out.println("Conexão aberta! POOOOOW");
	connection.close();
	*/
	
		}
}
	
/*	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pronto para gravar
		USUARIOBEAN Usuario = new USUARIOBEAN();
		Usuario.setCodigo("1");
		Usuario.setLogin("MICHEL");
		Usuario.setSenha("1234");
		// grave nessa conexão!!!
		USUARIOMODEL dao = new USUARIOMODEL();
		// método elegante
		dao.adiciona(Usuario);
		System.out.println("Usuario Gravado");
	}

}
*/