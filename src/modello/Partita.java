package modello;

import java.util.Date;

public class Partita {

	private Long id;
	private String casa;
	private	String ospite;
	private String citta;
	private Date data;
	
	
	//GET
	public Long getId() {
		return id;
	}
	public String getCasa() {
		return casa;
	}
	public String getOspite() {
		return ospite;
	}
	public String getCitta() {
		return citta;
	}
	public Date getData() {
		return data;
	}
	
	//SET
	public void setId(Long id) {
		this.id = id;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	public void setOspite(String ospite) {
		this.ospite = ospite;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public void setData(Date data) {
		this.data = data;
	}
	

	@Override
	public String toString() {
		return "Partita [id=" + id + ", casa=" + casa + ", ospite=" + ospite + ", citta=" + citta + ", data=" + data
				+ "]";
	}
	
	
	
}
