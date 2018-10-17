package modello.persistenza;

import java.util.List;

import modello.Biglietto;
import modello.Partita;
import modello.Utente;

public interface DAOBiglietto {

	public void add(Biglietto biglietto);
	public List<Biglietto> findAll();
	public Biglietto findById(Long id);
	public List<Biglietto> findByPartita(Partita partita);
	public List<Biglietto> findByUtente(Utente utente);
	public void update(Biglietto biglietto);
	public void delete(Biglietto biglietto);
	
	
	
}
