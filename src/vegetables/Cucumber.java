package vegetables;

public class Cucumber extends Vegetable {
	
	private boolean isFresh;
	
	public Cucumber(double weight, double calories, boolean isFresh) {
		super(weight, calories);
		this.isFresh = isFresh;
	}

	public boolean getIsFresh() {
		return isFresh;
	}

	public void setIsFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		
		if (this.isFresh) sb.append("Fresh");
		else sb.append("Not fresh");
		
		sb.append(" cucumber with: \n");
		return super.toString() + sb.toString();
	}
	
	public String getName() {
		return "Cucumber";
	}
	
	
	
}
