package autentica��o;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import autentica��o.USUARIOMODEL;
import autentica��o.USUARIODAO;

public class TESTE {


public static void main(String[] args) throws SQLException, ClassNotFoundException {


	USUARIODAO Conexao = new USUARIODAO();
	List<USUARIOMODEL> UsuarioLista = Conexao.getLista();
	
	for (USUARIOMODEL Us : UsuarioLista) {
		System.out.println("Nome: " + Us.getCodigo());
		System.out.println("Login: " + Us.getLogin());
		System.out.println("Senha: " + Us.getSenha());		}
	
	/*//ABRINDO UMA CONEX�O E ADICIONANDO UM REGISTRO
	USUARIOBEAN Usuario = new USUARIOBEAN();
		
	Usuario.setCodigo("1");
	Usuario.setLogin("Michel");
	Usuario.setSenha("1234");
	// ABRE UMA CONEX�O!!!
	USUARIODAO Conexao = new USUARIODAO();
	// GRAVA COM USO DESSE M�TODO
	Conexao.adiciona(Usuario);
	System.out.println("Gravado!");
	*/
	
	

	/*//PRIMEIRO EXEMPLO ABRINDO UMA CONEX�O
	Connection connection = new BANCO().getConnection();
	System.out.println("Conex�o aberta! POOOOOW");
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
		// grave nessa conex�o!!!
		USUARIOMODEL dao = new USUARIOMODEL();
		// m�todo elegante
		dao.adiciona(Usuario);
		System.out.println("Usuario Gravado");
	}

}
*/