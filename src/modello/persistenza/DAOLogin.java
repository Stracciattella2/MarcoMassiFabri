package modello.persistenza;

import modello.Login;

public interface DAOLogin {

	public Long login(Login login) throws DAOException;
	public void add(Login login) throws DAOException;
	public void delete(Long id) throws DAOException;
	
}
