package modello.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modello.Biglietto;
import modello.Partita;
import modello.Utente;
import modello.persistenza.DAOBiglietto;
import modello.persistenza.DAOException;
import modello.persistenza.DataSource;

public class DAOBigliettoImpl implements DAOBiglietto {

	@Override
	public void add(Biglietto biglietto) throws DAOException{

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement("INSERT INTO BIGLIETTO VALUES(?,?,?,?)");
			stmt.setLong(1, biglietto.getId());
			stmt.setLong(2, biglietto.getIdPartita());
			stmt.setLong(3, biglietto.getIdUtente());
			stmt.setDouble(4, biglietto.getPrezzo());
			stmt.executeUpdate();


		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return;
	}

	@Override
	public List<Biglietto> findAll() throws DAOException{
		
		List<Biglietto> biglietti = new ArrayList<>();
		String sql = "SELECT * FROM BIGLIETTO";
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement(sql);
			resultSet = stmt.executeQuery();

			while (resultSet.next()) {

				Biglietto bigliettoTmp = new Biglietto();
				bigliettoTmp.setId(resultSet.getLong("ID"));
				bigliettoTmp.setIdPartita(resultSet.getLong("ID_PARTITA"));
				bigliettoTmp.setIdUtente(resultSet.getLong("ID_UTENTE"));
				bigliettoTmp.setPrezzo(resultSet.getDouble("PREZZO"));
				biglietti.add(bigliettoTmp);

			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return biglietti;

	}

	@Override
	public Biglietto findById(Long id) throws DAOException{
		
		String sql = "SELECT * FROM BIGLIETTO WHERE ID = ?";
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Biglietto biglietto = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			resultSet = stmt.executeQuery();

			if (resultSet.next()) {
				biglietto = new Biglietto();
				
				biglietto.setId(resultSet.getLong("ID"));
				biglietto.setIdPartita(resultSet.getLong("ID_PARTITA"));
				biglietto.setIdUtente(resultSet.getLong("ID_UTENTE"));
				biglietto.setPrezzo(resultSet.getDouble("PREZZO"));

			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return biglietto;
		
	}

	@Override
	public List<Biglietto> findByPartita(Long id_partita) throws DAOException{
		
		List<Biglietto> biglietti = new ArrayList<>();
		String sql = "SELECT * FROM BIGLIETTO WHERE ID_PARTITA = ?";
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Biglietto biglietto = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id_partita);
			resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				biglietto = new Biglietto();
				
				biglietto.setId(resultSet.getLong("ID"));
				biglietto.setIdPartita(resultSet.getLong("ID_PARTITA"));
				biglietto.setIdUtente(resultSet.getLong("ID_UTENTE"));
				biglietto.setPrezzo(resultSet.getDouble("PREZZO"));

				biglietti.add(biglietto);
			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return biglietti;
		
	}

	@Override
	public List<Biglietto> findByUtente(Long id_utente) throws DAOException{
		
		List<Biglietto> biglietti = new ArrayList<>();
		String sql = "SELECT * FROM BIGLIETTO WHERE ID_UTENTE = ?";
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Biglietto biglietto = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id_utente);
			resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				biglietto = new Biglietto();
				
				biglietto.setId(resultSet.getLong("ID"));
				biglietto.setIdPartita(resultSet.getLong("ID_PARTITA"));
				biglietto.setIdUtente(resultSet.getLong("ID_UTENTE"));
				biglietto.setPrezzo(resultSet.getDouble("PREZZO"));

				biglietti.add(biglietto);
			}

		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return biglietti;
		
	}

	@Override
	public void update(Biglietto biglietto) throws DAOException{

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement("UPDATE BIGLIETTO SET ID_PARTITA = ?, ID_UTENTE = ?, PREZZO = ? WHERE ID = ?");
			stmt.setLong(1, biglietto.getIdPartita());
			stmt.setLong(2, biglietto.getIdUtente());
			stmt.setDouble(3, biglietto.getPrezzo());
			stmt.setLong(4, biglietto.getId());
			stmt.executeUpdate();


		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return;
	}

	@Override
	public void delete(Long id_biglietto) throws DAOException{
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = instance.getConnection();
			stmt = connection.prepareStatement("DELETE BIGLIETTO WHERE ID = ?");
			stmt.setLong(1, id_biglietto);
			stmt.executeUpdate();


		} catch (DAOException | SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		}

		return;
	}

}
