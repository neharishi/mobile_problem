
public class Mobile implements Structure{
	
	private Branch leftBranch;
	private Branch rightBranch;
	
	public Mobile(Branch l, Branch r) {
		leftBranch = l;
		rightBranch = r;
	}

	@Override
	public double getWeight() {
		return leftBranch.getStructure().getWeight() + rightBranch.getStructure().getWeight();
	}

	@Override
	public boolean isBalanced() {
		return (leftBranch.torque() == rightBranch.torque() && leftBranch.getStructure().isBalanced() && rightBranch.getStructure().isBalanced());
		
	}

}

