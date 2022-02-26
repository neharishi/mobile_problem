
public class Branch{
	
	private int length;
	private Structure structure; //why is structure a type of object?
	
	public Branch(int l, Structure s) {
		length = l;
		structure = s;
	}
	
	
	public int getLength() {
		return length;
	}
	
	public Structure getStructure() {
		return structure;
	}
	
	public double torque() {
		return length * structure.getWeight();
	}

}
