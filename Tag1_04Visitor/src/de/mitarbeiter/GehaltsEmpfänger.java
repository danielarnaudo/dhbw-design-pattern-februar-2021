package de.mitarbeiter;

import de.mitarbeiter.vistors.MitarbeiterVisitor;

public class GehaltsEmpfänger extends AbstractMitarbeiter {
	
	
	private double gehalt = 1000;

	public GehaltsEmpfänger(String name) {
		super(name);
		
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GehaltsEmpfänger [gehalt=");
		builder.append(gehalt);
		builder.append(", Name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.vistit(this);
		
	}

	
	
	
}
