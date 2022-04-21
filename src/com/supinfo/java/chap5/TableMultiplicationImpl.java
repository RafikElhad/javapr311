package com.supinfo.java.chap5;

public class TableMultiplicationImpl implements ItableMultiplication {

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

	@Override
	public void tablemultiplication(int nombre)  
	{
		for(int i=0; i<=12; i++) 
		{
			System.out.println(nombre + " X " + i + " = " + (nombre*i));
		}

	}

	@Override
	public void tableauMultiplication(int[] nombre) 
	{
		for(int i = 0; i<nombre.length; i++) 
		{
			tablemultiplication(nombre[i]);  
		}

	}

}
