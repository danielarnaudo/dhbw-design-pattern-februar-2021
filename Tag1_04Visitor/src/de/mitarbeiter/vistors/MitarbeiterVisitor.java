package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public interface MitarbeiterVisitor {
	
	void vistit(GehaltsEmpf�nger gehaltsEmpf�nger);
	void vistit(LohnEmpf�nger lohnEmpf�nger);

}
