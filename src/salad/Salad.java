package salad;

import java.util.ArrayList;
import java.util.List;

import vegetables.*;
	
/**
 * Abstract salad with some vegetables and number of total calories
 */
public abstract class Salad {
	
	/**
	 * Lest of vegetables in salad
	 */
	private List<Vegetable> vegetables;
	
	/**
	 * Total calories for salad
	 */
	private double totalCalories;
	
	
	/**
	 * Counstructor
	 */
	public Salad() {
		this.setVegetables(new ArrayList<Vegetable>());
		this.totalCalories = 0;
	}
	
	/**
	 * Add vegetable to the salad
	 * @param vegetable vegetable to add
	 */
	public void addVegetable(Vegetable vegetable) {
		getVegetables().add(vegetable);
		totalCalories += vegetable.getCalories();
	}
	
	
	/**
	 * Getters and setters
	 */
	public double getTotalCalories() {
		return totalCalories;
	}

	public List<Vegetable> getVegetables() {
		return vegetables;
	}

	public void setVegetables(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}
}
