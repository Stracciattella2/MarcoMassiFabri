package controllo;

import java.util.List;

import modello.Biglietto;
import modello.Partita;
import modello.persistenza.DAOException;
import modello.persistenza.impl.DAOBigliettoImpl;
import modello.persistenza.impl.DAOPartitaImpl;

public class MainF {

	public static void main(String[] args) {

		
		
		addBiglietto();
		
		findBigliettoByID();
		
		findBigliettoByPartita();
		
		findBigliettoByUtente();
		
		updateBiglietto();
		
		findAllBiglietti();
		
		deleteBiglietto();
		
		findAllBiglietti();
		
		
	}
	
	private static void findAllBiglietti() {
		System.out.println("\nFINDALL\n");
		
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
		System.out.println("\nADD 17\n");
		
		Biglietto biglietto = new Biglietto();
		
		biglietto.setId(17L);
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
		System.out.println("\nFINDBYID\n");
		
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		Biglietto biglietto;
		
		try {
			biglietto = daoBigliettoImpl.findById(1L);
			
			System.out.println(biglietto);
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}
	
	private static void findBigliettoByPartita() {
		System.out.println("\nFINDBYPARTITA\n");
		
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		List<Biglietto> biglietti;
		
		try {
			biglietti = daoBigliettoImpl.findByPartita(1L);
			
			for(Biglietto biglietto : biglietti) {
				System.out.println(biglietto);
			}
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	private static void findBigliettoByUtente() {
		System.out.println("\nFINDBYUTENTE\n");
		
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		List<Biglietto> biglietti;
		
		try {
			biglietti = daoBigliettoImpl.findByUtente(1L);
			
			for(Biglietto biglietto : biglietti) {
				System.out.println(biglietto);
			}
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	private static void updateBiglietto() {
		System.out.println("\nUPDATE 17\n");
		
		Biglietto biglietto = new Biglietto();
		
		biglietto.setId(17L);
		biglietto.setIdPartita(2L);
		biglietto.setIdUtente(1L);
		biglietto.setPrezzo(200D);
		
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		try {
			daoBigliettoImpl.update(biglietto);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void deleteBiglietto() {
		System.out.println("\nDELETE 17\n");
		
		DAOBigliettoImpl daoBigliettoImpl = new DAOBigliettoImpl();
		
		try {
			daoBigliettoImpl.delete(17L);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
