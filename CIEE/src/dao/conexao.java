package dao;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class conexao{
	Logger logger = Logger.getLogger1(conexao.class);
	private static conexao instance = null;
	private Connection conn;

	private String url = "jdbc:postgresql://localhost:5432/projetofinal";
	private String usuario = "postgres";
	private String senha = "1234";

	private conexao() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, usuario, senha);
			logger.info("Conexão ok!");
		} catch (Exception ex) {
			logger.error("Erro ao estabelecer conexão com o postgres : " + ex.getMessage());
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public static conexao getInstance() throws SQLException {
		if (instance == null) {
			instance = new conexao();
		} else if (instance.getConnection().isClosed()) {
			instance = new conexao();
		}

		return instance;
	}
}
