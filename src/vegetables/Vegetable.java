package vegetables;

public abstract class Vegetable implements Comparable<Vegetable> {
	
	private double weight;
	private double calories;
	
	/**
	 * @param weight
	 * @param calories
	 */
	public Vegetable(double weight, double calories) {
		this.weight = weight;
		this.calories = calories;
	}
	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\tWeight: " + this.weight + "\t");
		sb.append("\tCalories: " + this.calories + "\t");
		
		return sb.toString();
	}
	
	public int compareTo(Vegetable vegetable) {
		
		//ascending order
		return (int) this.weight -  (int) vegetable.getWeight();
		
	}
	
	public abstract String getName();
	
}
