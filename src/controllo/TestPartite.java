package controllo;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import modello.Partita;
import modello.persistenza.DAOException;
import modello.persistenza.DAOPartita;
import modello.persistenza.impl.DAOPartitaImpl;
import modello.persistenza.impl.DAOUtenteImpl;

public class TestPartite {

	public static void main(String[] args) {

		findAllParite();
		 findPartitaByLuogo();		
		findPartitaByNomeSquadra();
		// findPartitaByData();

	}

	private static void findPartitaByNomeSquadra() {

		DAOPartitaImpl daoPartitaImpl = new DAOPartitaImpl();

		List<Partita> partite;

		try {
			System.out.println("\nQuale squarda vuoi cercare:\n");
			Scanner input = new Scanner(System.in);
			String nomeSquadra = input.nextLine();
			partite = daoPartitaImpl.findPartitaByNomeSquadra(nomeSquadra.toUpperCase());

			for (Partita partita : partite) {
				System.out.println(partita);
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void findPartitaByData() {
		
	

	}

	private static void findPartitaByLuogo() {

		DAOPartitaImpl daoPartitaImpl = new DAOPartitaImpl();

		List<Partita> partite;

		try {
			System.out.println("\nCerca le partite nella citta: :\n");
			Scanner input = new Scanner(System.in);
			String luogo = input.nextLine();
			partite = daoPartitaImpl.findPartitaByLuogo(luogo.toUpperCase());

			for (Partita partita : partite) {
				System.out.println(partita);
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
