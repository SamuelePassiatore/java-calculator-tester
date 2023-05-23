package org.java.calculator;

public class Calculator {
	private float x;
	private float y;
	
	public Calculator(float x, float y) {
		setX(x);
		setY(y);
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public float getAdd() {
		return getX() + getY();
	}
	
	public float getSubtract() {
		return getX() - getY();
	}
	
	public float getDivide() {
		return getX() / getY();
	}
	
	public float getMultiply() {
		return getX() * getY();
	}
	

}
