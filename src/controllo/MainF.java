package controllo;

import java.util.List;

import modello.Biglietto;
import modello.Partita;
import modello.persistenza.DAOException;
import modello.persistenza.impl.DAOBigliettoImpl;
import modello.persistenza.impl.DAOPartitaImpl;

public class MainF {

	public static void main(String[] args) {

		findAllParite();
//		DAOUtenteImpl daoUtenteImpl = new DAOUtenteImpl();
//		daoUtenteImpl.cercaUtenti();
		
		findAllBiglietti();
//		addBiglietto();
		
		
		
	}

	private static void findAllParite() {
		DAOPartitaImpl daoPartitaImpl = new DAOPartitaImpl();

		List<Partita> partite;

		try {
			partite = daoPartitaImpl.findAll();

			for (Partita partita : partite) {
				System.out.println(partita);
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void findAllBiglietti() {
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		List<Biglietto> biglietti;
		
		try {
			biglietti = daoBigliettoImpl.findAll();
			
			for(Biglietto biglietto : biglietti) {
				System.out.println(biglietto);
			}
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void addBiglietto() {
		
		Biglietto biglietto = new Biglietto();
		
		biglietto.setId(15L);
		biglietto.setIdPartita(1L);
		biglietto.setIdUtente(1L);
		biglietto.setPrezzo(200D);
		
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		try {
			daoBigliettoImpl.add(biglietto);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void findBigliettoByID() {
		
	}
	
	private static void findBigliettoByPartita() {
		
	}

}
