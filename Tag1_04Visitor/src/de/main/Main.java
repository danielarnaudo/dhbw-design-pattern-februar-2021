package de.main;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpf�nger;
import de.mitarbeiter.LohnEmpf�nger;
import de.mitarbeiter.vistors.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.add(new GehaltsEmpf�nger("Schmidt"));
		firma.add(new GehaltsEmpf�nger("Mayer"));
		firma.add(new LohnEmpf�nger("Hinz"));
		firma.add(new LohnEmpf�nger("Kunz"));
		firma.add(new GehaltsEmpf�nger("Schulz"));

		//firma.print();
		firma.iterate(new PrintVisitor());
	}

}
