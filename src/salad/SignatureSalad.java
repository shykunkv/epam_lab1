package salad;

import java.util.Collections;
import java.util.Random;

import vegetables.Tomato;
import vegetables.Cucumber;
import vegetables.Vegetable;


/**
 * Some implementation of abstract Salad
 * Salad with cucumbers and tomatoes
 */
public class SignatureSalad extends Salad {
	
	/**
	 * Salad price in $
	 */
	private double price;
	
	/**
	 * NUmber of tomatoes in this salad
	 */
	private int tomatoNum;
	
	/**
	 * Number of cucumbers in this salad
	 */
	private int cucumberNum;
	
	/**
	 * Constructor
	 * @param price salad price
	 * @param tomatoNum number of tomatoes
	 * @param cucumberNum number of cucumbers
	 */
	public SignatureSalad(double price, int tomatoNum, int cucumberNum) {
		super();
		this.price = price;
		this.tomatoNum = tomatoNum;
		
		
		Random rand = new Random();
		
		// generate 'tomatoNum' random tomatoes and add them into salad
		for (int i = 0; i < tomatoNum; i++) {
			Tomato tomato = new Tomato(15 * rand.nextDouble(), rand.nextInt(150), Tomato.Color.RED, true);
			this.addVegetable(tomato);
		}
		
		// generate 'cucumberNum' random cucumber and add them into salad
		for (int i = 0; i < cucumberNum; i++) {
			Cucumber cucumber = new Cucumber(15 * rand.nextDouble(), rand.nextInt(150), true);
			this.addVegetable(cucumber);
		}
	}
	
	
	public double getSaladCalories() {
		return this.getTotalCalories();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Signature salad: \n");
		for (Vegetable v : this.getVegetables()) {
			sb.append("\t" + v.getName() + " (" + v.getWeight() + ")\n");
		}
		return sb.toString();
	}
	
	/**
	 * Sort vegetables in salad by their weights
	 */
	public void sortByWeight() {
		Collections.sort(this.getVegetables());
	} 
	
	/**
	 * Find vegetables in salad with number of calories in specific range
	 * @param minCalories minimum number of the calories
	 * @param maxCalories maximum number of the calories
	 */
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
