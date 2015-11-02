package Main;

import Salad.SignatureSalad;

public class Main {
	
	public static void main(String[] args) {
		SignatureSalad testSalad = new SignatureSalad(199, 10, 10);
		
		testSalad.find(100, 200);
		
		//System.out.println(testSalad.toString());
		
		//testSalad.sortByWeight();
		//System.out.println(testSalad.toString());
		
	}
}
