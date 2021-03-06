package modello.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modello.Partita;
import modello.persistenza.DAOException;
import modello.persistenza.DAOPartita;
import modello.persistenza.DataSource;

public class DAOPartitaImpl implements DAOPartita {

	/**
	 * Restituisce tutte le partite presenti nel database
	 */
	@Override
	public List<Partita> findAll() throws DAOException {

		List<Partita> partite = new ArrayList<>();
		String sql = "select * from partita";
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;

		try {
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			resultSet = prepareStatement.executeQuery();

			while (resultSet.next()) {

				Partita partita = new Partita();
				partita.setId(resultSet.getLong("ID"));
				partita.setCasa(resultSet.getString("CASA"));
				partita.setOspite(resultSet.getString("OSPITE"));
				partita.setData(resultSet.getDate("DATA_PARTITA"));
				partita.setCitta(resultSet.getString("CITTA"));
				partite.add(partita);

			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
		}

		return partite;
	}

	@Override

	public List<Partita> findPartitaByNomeSquadra(String nome) throws DAOException {
		List<Partita> partite = new ArrayList<>();
		String sql = "select * from partita where CASA=? or OSPITE=?" ;

		System.out.println(sql);

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;

		try {
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, nome);
			prepareStatement.setString(2, nome);
			
			resultSet = prepareStatement.executeQuery();

			while (resultSet.next()) {

				Partita partita = new Partita();
				partita.setId(resultSet.getLong("ID"));
				partita.setCasa(resultSet.getString("CASA"));
				partita.setOspite(resultSet.getString("OSPITE"));
				partita.setData(resultSet.getDate("DATA_PARTITA"));
				partita.setCitta(resultSet.getString("CITTA"));
				partite.add(partita);

			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
		}

		return partite;

	}

	@Override
	public List<Partita> findPartitaByData(Date data) throws DAOException {
		List<Partita> partite = new ArrayList<>();
		String sql = "select * from partita where DATA_PARTITA=" + data;

		System.out.println(sql);

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;

		try {
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			resultSet = prepareStatement.executeQuery();

			while (resultSet.next()) {

				Partita partita = new Partita();
				partita.setId(resultSet.getLong("ID"));
				partita.setCasa(resultSet.getString("CASA"));
				partita.setOspite(resultSet.getString("OSPITE"));
				partita.setData(resultSet.getDate("DATA_PARTITA"));
				partita.setCitta(resultSet.getString("CITTA"));
				partite.add(partita);

			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
		}

		return partite;

	}

	@Override
	public List<Partita> findPartitaByLuogo(String luogo) throws DAOException {
		List<Partita> partite = new ArrayList<>();
		String sql = "select * from partita where CITTA= ?" ;

		System.out.println(sql);

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;

		try {
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, luogo);
			resultSet = prepareStatement.executeQuery();

			while (resultSet.next()) {

				Partita partita = new Partita();
				partita.setId(resultSet.getLong("ID"));
				partita.setCasa(resultSet.getString("CASA"));
				partita.setOspite(resultSet.getString("OSPITE"));
				partita.setData(resultSet.getDate("DATA_PARTITA"));
				partita.setCitta(resultSet.getString("CITTA"));
				partite.add(partita);

			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
		}

		return partite;

	}

}
