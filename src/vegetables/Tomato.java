package vegetables;

public class Tomato extends Vegetable {
	
	public enum Color {RED, YELLOW, ORANGE};
	
	private Color color;
	private boolean isFresh;
	
	
	public Tomato(double weight, double calories, Color color, boolean isFresh) {
		super(weight, calories);
		this.color = color;
		this.isFresh = isFresh;
	}

	
	
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
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if (this.isFresh) sb.append("Fresh ");
		else sb.append("Not fresh ");
		
		sb.append(this.color.toString() + " tomato with: \n");
		return sb.toString() + super.toString();
	}
	
	public String getName() {
		return "Tomato";
	}
	
	
	
}
