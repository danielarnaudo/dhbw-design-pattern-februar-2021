package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{


	@Override
	public void vistit(GehaltsEmpf�nger gehaltsEmpf�nger) {
		// Ok

	}

	@Override
	public void vistit(LohnEmpf�nger lohnEmpf�nger) {
		// Ok

	}

}
