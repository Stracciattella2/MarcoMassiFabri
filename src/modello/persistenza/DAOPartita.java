package modello.persistenza;

import java.util.Date;
import java.util.List;

import modello.Partita;

public interface DAOPartita {
	/**
	 * 
	 * @return : una lista con tutte le partite da disputare 
	 * @throws DAOException
	 */
	public List<Partita> findAll() throws DAOException;
	/**
	 * 
	 * @param nome il nome della squadra
	 * @return tutte le partite  le quali il nome della squadra corrisponde al nome passato come parametro
	 * @throws DAOException
	 */
	public List<Partita> findPartitaByNomeSquadra(String nome) throws DAOException;
	/**
	 * 
	 * @param data : la data della partita
	 * @return  tutte le partite   che si disputano nella data passata come parametro
	 * @throws DAOException
	 */
	public List<Partita> findPartitaByData(Date data) throws DAOException;
	/**
	 * 
	 * @param luogo: il luogo dove si disputa la partita
	 * @return : restituisce le partite che si disputano nella citta "luogo" passata come parametro
	 * @throws DAOException
	 */
	public List<Partita> findPartitaByLuogo(String luogo) throws DAOException;

}
