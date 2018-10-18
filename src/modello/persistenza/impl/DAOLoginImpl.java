package modello.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modello.Biglietto;
import modello.Login;
import modello.persistenza.DAOException;
import modello.persistenza.DAOLogin;
import modello.persistenza.DataSource;

public class DAOLoginImpl implements DAOLogin {

	@Override
	public Long login(Login login) throws DAOException {
		
		String sql = "SELECT * FROM LOGIN WHERE USERNAME = ? AND PSW = ?";
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Long id = null;
		
		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, login.getUsername());
			stmt.setString(2, login.getPassword());
			resultSet = stmt.executeQuery();

			if(resultSet.next()) {
				id = resultSet.getLong("ID_UTENTE");
			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return id;
		
	}

	@Override
	public void add(Login login) throws DAOException {

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement("INSERT INTO LOGIN VALUES(?,?,?)");
			stmt.setString(1, login.getUsername());
			stmt.setString(2, login.getPassword());
			stmt.setLong(3, login.getId_utente());
			stmt.executeUpdate();


		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return;
	}

	@Override
	public void delete(Long id) throws DAOException {
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement("DELETE LOGIN WHERE ID = ?");
			stmt.setLong(1, id);
			stmt.executeUpdate();


		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return;
	}

}
