package controllo;

import java.util.List;

import modello.Partita;
import modello.persistenza.DAOException;
import modello.persistenza.DAOPartita;
import modello.persistenza.impl.DAOPartitaImpl;
import modello.persistenza.impl.DAOUtenteImpl;

public class Main {

	public static void main(String[] args) {

		findAllParite();
//		DAOUtenteImpl daoUtenteImpl = new DAOUtenteImpl();
//		daoUtenteImpl.cercaUtenti();
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

}