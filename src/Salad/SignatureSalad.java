package Salad;

import java.util.Collections;
import java.util.Random;

import vegetables.Tomato;
import vegetables.Cucumber;
import vegetables.Vegetable;

public class SignatureSalad extends Salad {
	
	private double price;
	private int tomatoNum;
	private int cucumberNum;
	
	public SignatureSalad(double price, int tomatoNum, int cucumberNum) {
		super();
		this.price = price;
		this.tomatoNum = tomatoNum;
		
		
		Random rand = new Random();
		
		for (int i = 0; i < tomatoNum; i++) {
			Tomato tomato = new Tomato(15 * rand.nextDouble(), rand.nextInt(150), Tomato.Color.RED, true);
			this.addVegetable(tomato);
		}
		
		for (int i = 0; i < cucumberNum; i++) {
			Cucumber cucumber = new Cucumber(15 * rand.nextDouble(), rand.nextInt(150), true);
			this.addVegetable(cucumber);
		}
	}
	
	public double getSaladCalories() {
		return this.getTotalCalories();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Signature salad: \n");
		for (Vegetable v : this.getVegetables()) {
			sb.append("\t" + v.getName() + " (" + v.getWeight() + ")\n");
		}
		return sb.toString();
	}
	
	public void sortByWeight() {
		Collections.sort(this.getVegetables());
	} 
	
	public void find(double minCalories, double maxCalories) {
		StringBuilder sb = new StringBuilder();
		sb.append("Vegetables with calories " + (int) minCalories + " - " + (int) maxCalories + "\n");
		
		for (Vegetable v : this.getVegetables()) {
			if (v.getCalories() >= minCalories && v.getCalories() <= maxCalories) {
				sb.append("\t" + v.getName() + "[ " + v.getCalories() + " ]\n");
			}
		}
		
		System.out.println(sb.toString());
	}
	
	
}
