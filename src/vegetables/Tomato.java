package vegetables;

/**
 * Implementation of abstract Vegetable - Tomato
 */
public class Tomato extends Vegetable {
	
	
	public enum Color {RED, YELLOW, ORANGE};
	
	/**
	 * Tomato color
	 */
	private Color color;
	
	/**
	 * Fresh or pickled tomato
	 */
	private boolean isFresh;
	
	
	/**
	 * Constructor
	 */
	public Tomato(double weight, double calories, Color color, boolean isFresh) {
		super(weight, calories);
		this.color = color;
		this.isFresh = isFresh;
	}

	
	
	/**
	 * Getters and setter
	 */
	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see vegetables.Vegetable#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if (this.isFresh) sb.append("Fresh ");
		else sb.append("Not fresh ");
		
		sb.append(this.color.toString() + " tomato with: \n");
		return sb.toString() + super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see vegetables.Vegetable#getName()
	 */
	@Override
	public String getName() {
		return "Tomato";
	}
	
	
	
}
