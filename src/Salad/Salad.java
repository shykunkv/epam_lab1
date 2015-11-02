package Salad;

import java.util.ArrayList;
import java.util.List;

import vegetables.*;

public abstract class Salad {
	
	private List<Vegetable> vegetables;
	private double totalCalories;
	
	
	public Salad() {
		this.setVegetables(new ArrayList<Vegetable>());
		this.totalCalories = 0;
	}
	
	public void addVegetable(Vegetable vegetable) {
		getVegetables().add(vegetable);
		totalCalories += vegetable.getCalories();
	}
	
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
