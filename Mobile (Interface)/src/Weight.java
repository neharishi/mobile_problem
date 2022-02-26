
public class Weight implements Structure{
	
	private double weight;
	
	public Weight(int w) {
		weight = w;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public boolean isBalanced() {
		return true;
	}

}
