package controllo;

import modello.persistenza.impl.DAOUtenteImpl;

public class Main {

	public static void main(String[] args) {
		DAOUtenteImpl daoUtenteImpl= new DAOUtenteImpl();
		daoUtenteImpl.cercaUtenti();
	}

}
