package org.java.calculator;

import java.time.LocalDate;

public class Employee {

   private String nome;
   private String cognome;
   private LocalDate dataDiNascita;
   private String ruolo;
   

   public Employee(String nome, String cognome, LocalDate dataDiNascita, String ruolo) throws Exception {
	   setNome(nome);
	   setCognome(cognome);
	   setDataDiNascita(dataDiNascita);
	   setRuolo(ruolo);
   }

	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) throws Exception {
		if (nome.isEmpty()) {
            throw new Exception("Il nome non può essere vuoto");
        }
		this.nome = nome;
	}
	
	
	public String getCognome() {
		return cognome;
	}
	
	
	public void setCognome(String cognome) throws Exception {
		if (cognome.isEmpty()) {
            throw new Exception("Il cognome non può essere vuoto");
        }
		this.cognome = cognome;
	}
	
	
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	
	
	public void setDataDiNascita(LocalDate dataDiNascita) throws Exception {
		if (dataDiNascita.isAfter(LocalDate.now())) {
			throw new Exception("La data di nascita deve essere nel passato");
	    }
		this.dataDiNascita = dataDiNascita;
	}
	
	
	public String getRuolo() {
		return ruolo;
	}
	
	
	public void setRuolo(String ruolo) throws Exception {
		if (!ruolo.equalsIgnoreCase("employee") && !ruolo.equalsIgnoreCase("boss")) {
            throw new Exception("Il ruolo deve essere 'employee' o 'boss'");
        }
		this.ruolo = ruolo;
	}
}
