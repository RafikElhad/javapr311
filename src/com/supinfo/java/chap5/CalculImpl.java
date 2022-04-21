package com.supinfo.java.chap5;

public class CalculImpl implements ICalcul {

	@Override
	public int addition(int a, int b) 
	{
		
		return a + b; 
	}

	@Override
	public int soustraction(int a, int b)  
	{
		
		return a - b;
	}

	@Override 
	public int multiplication(int a, int b) 
	{
		
		return a * b;
	}

	@Override
	public int division(int a, int b) 
	{
		
		return a / b;
	}

	@Override
	public int modulo(int a, int b) 
	{
		
		return a % b; 
	}

}
