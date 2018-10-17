package modello.persistenza;

import java.util.List;

import modello.Partita;

public interface DAOPartita {
	
	public List<Partita> findAll() throws DAOException;

}
