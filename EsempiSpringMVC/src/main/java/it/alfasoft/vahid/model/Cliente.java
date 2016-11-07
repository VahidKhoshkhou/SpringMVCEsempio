package it.alfasoft.vahid.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Size(min=5,max=10)
	private String nome;
	private String cognome;
	private int eta;
	
	private Date dataNascita;
	
	private long cellulare;
	
	private List<String> sopraNomi;
	
	private Indirizzo inidirizzo;
	
	public Cliente() {
		
	
	}
	public Cliente(String nome, String cognome, int eta) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public long getCellulare() {
		return cellulare;
	}
	public void setCellulare(long cellulare) {
		this.cellulare = cellulare;
	}
	public List<String> getSopraNomi() {
		return sopraNomi;
	}
	public void setSopraNomi(List<String> sopraNomi) {
		this.sopraNomi = sopraNomi;
	}
	public Indirizzo getInidirizzo() {
		return inidirizzo;
	}
	public void setInidirizzo(Indirizzo inidirizzo) {
		this.inidirizzo = inidirizzo;
	}
	
	

}
