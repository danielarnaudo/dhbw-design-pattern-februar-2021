package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;

public class PrintVisitor implements MitarbeiterVisitor{

	@Override
	public void vistit(GehaltsEmpf�nger gehaltsEmpf�nger) {
		System.out.println(gehaltsEmpf�nger);
		
	}

	@Override
	public void vistit(LohnEmpf�nger lohnEmpf�nger) {
		System.out.println(lohnEmpf�nger);
		
	}

}
