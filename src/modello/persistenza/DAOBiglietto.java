package modello.persistenza;

import java.util.List;

import modello.Biglietto;
import modello.Partita;
import modello.Utente;

public interface DAOBiglietto {

	public void add(Biglietto biglietto) throws DAOException;
	public List<Biglietto> findAll() throws DAOException;
	public Biglietto findById(Long id) throws DAOException;
	public List<Biglietto> findByPartita(Long id_partita) throws DAOException;
	public List<Biglietto> findByUtente(Long id_utente) throws DAOException;
	public void update(Biglietto biglietto) throws DAOException;
	public void delete(Long id_biglietto) throws DAOException;
	
	
	
}
