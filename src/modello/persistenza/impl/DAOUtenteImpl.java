package modello.persistenza.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import modello.Utente;
import modello.persistenza.DAOException;
import modello.persistenza.DataSource;

public class DAOUtenteImpl {

	
	public void cercaUtenti() {
		
		Collection<Utente> squadre = new ArrayList<Utente>(0);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = DataSource.getInstance().getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM UTENTE");
			
			while(resultSet.next()) {
				
				System.out.println(resultSet.getInt("ID"));

				System.out.println(resultSet.getString("NOME"));

				System.out.println(resultSet.getString("COGNOME"));
				
			}
		} catch (SQLException | DAOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			DataSource.getInstance().close(resultSet);
			DataSource.getInstance().close(statement);
			DataSource.getInstance().close(connection);
		}

	}
}
