package vegetables;


/**
 * Abstract vegetable
 */
public abstract class Vegetable implements Comparable<Vegetable> {
	
	/**
	 * Vegetable weight
	 */
	private double weight;
	
	/**
	 * Number of calories in vegetable
	 */
	private double calories;
	
	
	/**
	 * Constructor
	 * @param weight
	 * @param calories
	 */
	public Vegetable(double weight, double calories) {
		this.weight = weight;
		this.calories = calories;
	}
	
	/**
	 * Getters and setters
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\tWeight: " + this.weight + "\t");
		sb.append("\tCalories: " + this.calories + "\t");
		
		return sb.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Vegetable vegetable) {
		//ascending order
		return (int) this.weight -  (int) vegetable.getWeight();
		
	}
	
	/**
	 * Get name of the vegetable
	 * @return vegetable name
	 */
	public abstract String getName();
	
}
