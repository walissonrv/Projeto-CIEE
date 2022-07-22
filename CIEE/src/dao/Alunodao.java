package dao;






import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import model.Aluno;

public class Alunodao implements Idao<Aluno>{

	Logger logger = Logger.getLogger(Alunodao.class);
	
	public boolean salvar1 (Aluno m) {
		logger.info("--- Início do método Salvar ---");

		try {
			Connection connection = conexao.getInstance().getConnection();

			String insert = "INSERT INTO aluno (nome, numeromatricula, data_cadastro) values (?, ?, ?)";
			PreparedStatement preparedStatement1 = connection.prepareStatement(insert);
			preparedStatement1.setString(1, m.getNome());
			preparedStatement1.setDouble(2, m.getNumero_matricula());
			preparedStatement1.setDate(3, java.sql.Date.valueOf(m.getData_cadastro()));
			logger.info("String insert do aluno preparado: " + preparedStatement1);
			int resultado = preparedStatement1.executeUpdate();

			if (resultado > 0) {
				logger.info("Retorno maior que zero da execução do insert na tabela aluno: " + resultado);
				logger.info("--- Fim do método Salvar ---");
				return true;
			} else {
				logger.info("Retorno menor que zero da execução do insert na tabela aluno: " + resultado);
				logger.info("--- Fim do método Salvar ---");
				return false;

			}
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar salvar: " + e.getMessage());
			logger.error("--- Fim do método Salvar ---");
			return false;
		}
	}

	public boolean alterar1(Aluno m) {
		logger.info("--- Início do método Alterar ---");

		try {
			Connection connection = conexao.getInstance().getConnection();

			String insert = "update funcionario set nome = ?, salario = ? where id = ?";
			PreparedStatement preparedStatement1 = connection.prepareStatement(insert);
			preparedStatement1.setString(1, m.getNome());
			preparedStatement1.setDouble(2, m.getNumero_matricula());
			preparedStatement1.setInt(3, m.getId());
			logger.info("String update do funcionário preparada: " + preparedStatement1);
			int resultado = preparedStatement1.executeUpdate();

			if (resultado > 0) {
				logger.info("Retorno maior que zero da execução do update na tabela de aluno: " + resultado);
				logger.info("--- Fim do método Alterar ---");
				return true;
			} else {
				logger.info("Retorno menor que zero da execução de update na tabela de aluno: " + resultado);
				logger.info("--- Fim do método Alterar ---");
				return false;

			}
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar alterar: " + e.getMessage());
			logger.error("--- Fim do método Alterar ---");
			return false;
		}
	}

	public boolean excluir1(Aluno m) {
		logger.info("--- Início do método Excluir ---");

		try {
			Connection connection = conexao.getInstance().getConnection();

			String insert = "delete from aluno where id = ?";
			PreparedStatement preparedStatement1 = connection.prepareStatement(insert);
			preparedStatement1.setInt(1, m.getId());
			logger.info("String delete do aluno preparada: " + preparedStatement1);
			int resultado = preparedStatement1.executeUpdate();

			if (resultado > 0) {
				logger.info("Retorno maior que zero do delete na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Excluir ---");
				return true;
			} else {
				logger.info("Retorno menor que zero do delete na tabela de funcionário: " + resultado);
				logger.info("--- Fim do método Excluir ---");
				return false;

			}
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar excluir: " + e.getMessage());
			logger.error("--- Fim do método Excluir ---");
			return false;
		}
	}

	public boolean buscar1(Aluno m) {
		// TODO Auto-generated method stub
		return false;
	}

	public Aluno buscar1(int id) {
		logger.info("--- Início do método Buscar por Id ---");

		try {
			Connection connection = conexao.getInstance().getConnection();
	
			String consulta = "select * from aluno "
							+ "where id = ?";
			Aluno aluno = new Aluno();
	
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			logger.info("Consulta executada: " + preparedStatement);
	
			while (resultSet.next()) {
				aluno.setId(resultSet.getInt("id"));
				aluno.setNome(resultSet.getString("nome"));
				aluno.setNumero_matricula(resultSet.getDouble("numeromatricula"));
				aluno.setData_cadastro(resultSet.getDate("data_cadastro").toLocalDate());
			}
	
			logger.info("--- Fim do método Buscar por Id ---");
	
			return aluno;
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar buscar um aluno: " + e.getMessage());
			logger.error("--- Fim do método Buscar por Id ---");
			return null;
		}
	}

	public List<Aluno> buscarTodos() {
		logger.info("--- Início do método Buscar Todos ---");

		try {
			Connection connection = conexao.getInstance().getConnection();
	
			String consulta = "select * from aluno";
			List<Aluno> lista = new ArrayList<Aluno>();
			Aluno aluno;
	
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			ResultSet resultSet = preparedStatement.executeQuery();
			logger.info("Consulta executada: " + preparedStatement);
	
			while (resultSet.next()) {
				aluno = new Aluno();
				aluno.setId(resultSet.getInt("id"));
				aluno.setNome(resultSet.getString("nome"));
				aluno.setNumero_matricula(resultSet.getDouble("numeromatricula"));
				aluno.setData_cadastro(resultSet.getDate("data_cadastro").toLocalDate());
				lista.add(aluno);
			}
			
			logger.info("Quantidade de registros pesquisados: " + lista.size());
			logger.info("--- Fim do método Buscar Todos ---");

			return lista;
		} catch (Exception e) {
			logger.error("Ocorreu um erro ao tentar executar o método buscar todos alunos: " + e.getMessage());
			logger.error("--- Fim do método Buscar Todos ---");
			return null;
		}

	}

	@Override
	public boolean salvar(Aluno m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Aluno m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Aluno m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscar(Aluno m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Aluno buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

