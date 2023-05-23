package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
		
	@Test
	@DisplayName("Employee with empty name Testing")
	public void getEmployeeWithEmptyNameTest() throws Exception{
		String nome = "";
		String cognome = "Marx";
		LocalDate dataDiNascita = LocalDate.of(1818, 5, 5);
		String ruolo = "employee";
		
		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);
		assumeTrue(e.getNome() == "");
		
		assertThrows(Exception.class,
				() -> e.getNome(),
				"Deve sollevare eccezione perchè il nome è vuoto");
	}
	
	@Test
	@DisplayName("Employee with empty surname Testing")
	public void getEmployeeWithEmptySurnameTest() throws Exception{
		String nome = "Karl";
		String cognome = "";
		LocalDate dataDiNascita = LocalDate.of(1818, 5, 5);
		String ruolo = "employee";
		
		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);
		assumeTrue(e.getCognome() == "");
		
		assertThrows(Exception.class,
				() -> e.getCognome(),
				"Deve sollevare eccezione perchè il cognome è vuoto");
	}
	
	@Test
	@DisplayName("Employee with future date of birth Testing")
	public void getEmployeeWithFutureDateTest() throws Exception{
		String nome = "Karl";
		String cognome = "Marx";
		LocalDate dataDiNascita = LocalDate.of(2025, 5, 5);
		String ruolo = "employee";
		
		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);
		
		
		assertThrows(Exception.class,
				() -> e.getDataDiNascita(),
				"Deve sollevare eccezione perchè la data di nascita non può essere nel futuro");
	}
	
	@Test
	@DisplayName("Employee with invalid rule Testing")
	public void getEmployeeWithInvalidRuleTest() throws Exception{
		String nome = "Karl";
		String cognome = "Marx";
		LocalDate dataDiNascita = LocalDate.of(1818, 5, 5);
		String ruolo = "chef";
		
		final Employee e = new Employee(nome, cognome, dataDiNascita, ruolo);
		
		
		assertThrows(Exception.class,
				() -> e.getRuolo(),
				"Deve sollevare eccezione perchè il ruolo non è quello previsto");
	}
	
	
	
	
}
