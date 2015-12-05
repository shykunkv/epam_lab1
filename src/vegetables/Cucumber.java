package vegetables;

/**
 * Some implementation of abstract vegetable - Cucumber
 */
public class Cucumber extends Vegetable {
		
	/**
	 * Is this cucumber fresh or pickled
	 */
	private boolean isFresh;
	
	/**
	 * Constructor
	 */
	public Cucumber(double weight, double calories, boolean isFresh) {
		super(weight, calories);
		this.isFresh = isFresh;
	}

	/**
	 * Getters and setter
	 */
	public boolean getIsFresh() {
		return isFresh;
	}

	public void setIsFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	/*
	 * (non-Javadoc)
	 * @see vegetables.Vegetable#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		
		if (this.isFresh) sb.append("Fresh");
		else sb.append("Not fresh");
		
		sb.append(" cucumber with: \n");
		return super.toString() + sb.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see vegetables.Vegetable#getName()
	 */
	@Override
	public String getName() {
		return "Cucumber";
	}
	
	
	
}
