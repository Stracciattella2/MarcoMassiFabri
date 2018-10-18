package modello;

public class Biglietto {

	private Long id;
	private Long idPartita;
	private Long idUtente;
	private Double prezzo;
	
	//GET
	public Long getId() {
		return id;
	}
	public Long getIdPartita() {
		return idPartita;
	}
	public Long getIdUtente() {
		return idUtente;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	
	//SET
	public void setId(Long id) {
		this.id = id;
	}
	public void setIdPartita(Long idPartita) {
		this.idPartita = idPartita;
	}
	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Biglietto [id=" + id + ", idPartita=" + idPartita + ", idUtente=" + idUtente + ", prezzo=" + prezzo
				+ "]";
	}
	
	
	
}
