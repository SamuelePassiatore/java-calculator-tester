package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	@DisplayName("Add Testing")
	public void getAddTest() {
		Random rnd = new Random();
		final float x = rnd.nextFloat();
		final float y = rnd.nextFloat();
		final float attRes = x + y;
		final Calculator c = new Calculator (x,y);
		final float res = c.getAdd();
		assertEquals(attRes, res);
	}
	
	@Test
	@DisplayName("Subtract Testing")
	public void getSubtractTest() {
		Random rnd = new Random();
		final float x = rnd.nextFloat();
		final float y = rnd.nextFloat();
		final float attRes = x - y;
		final Calculator c = new Calculator (x,y);
		final float res = c.getSubtract();
		assertEquals(attRes, res);
	}
	
	@Test
	@DisplayName("Divide Testing")
	public void getDivideTest() {
		Random rnd = new Random();
		final float x = rnd.nextFloat();
		final float y = rnd.nextFloat();
		final float attRes = x / y;
		final Calculator c = new Calculator (x,y);
		final float res = c.getDivide();
		assertEquals(attRes, res);
	}
	
	@Test
	@DisplayName("Multiply Testing")
	public void getMultiplyTest() {
		Random rnd = new Random();
		final float x = rnd.nextFloat();
		final float y = rnd.nextFloat();
		final float attRes = x * y;
		final Calculator c = new Calculator (x,y);
		final float res = c.getMultiply();
		assertEquals(attRes, res);
	}
	
	
	@Test
	@DisplayName("Divide integer Testing")
	public void getDivideIntTest() {
		Random rnd = new Random();
		final float x = rnd.nextFloat();
		final float y = rnd.nextFloat();
		
		final Calculator c = new Calculator (x,y);
		
		assumeTrue(c.getY() != 0);
		
		final float attRes = c.getX() / c.getY();
		
		final float res = c.getDivide();
		
		assertEquals(attRes, res, "Divisione tra interi");
	}
	
	@Test
	@DisplayName("Divide exception Testing")
	public void getDivideExceptionTest() {
		Random rnd = new Random();
		final float x = rnd.nextFloat();
		final float y = rnd.nextFloat();
		
		final Calculator c = new Calculator (x,y);
		assumeTrue(c.getY() == 0);
		
		assertThrows(Exception.class,
				() -> c.getDivide(),
				"Deve sollevare eccezione perchè il secondo numero è uguale a zero");
	}
}
