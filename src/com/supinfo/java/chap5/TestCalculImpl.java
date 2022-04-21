package com.supinfo.java.chap5;

public class TestCalculImpl {

	public static void main(String[] args) 
	{
		//Icalcul icalcul = new Icalcul();
		//Calculmpl calculImpl = new CalculImpl(); 
		ICalcul icalcul = new CalculImpl();
		System.out.println(icalcul.addition(10, 20));
		System.out.println(icalcul.soustraction(20, 10));
		System.out.println(icalcul.multiplication(6, 3));
		System.out.println(icalcul.division(20, 4)); 
		System.out.println(icalcul.modulo(10, 6));  
		
		/*int [] tabNombre = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		ItableMultiplication tableMultiplication = new tableMultiplication();
		tableMultiplication.tableMultiplication(tabNombre);
		*/

	}

}
