package de.composite;

public class Leaf extends AbstractNode {

	public Leaf(String label) {
		super(label);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Leaf [Label=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	
	
}
