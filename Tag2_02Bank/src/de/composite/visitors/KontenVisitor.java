package de.composite.visitors;

import de.composite.Konto;
import de.composite.KontoGruppe;

public interface KontenVisitor {
	
	public void init();
	public void visit(Konto konto);
	public void visit(KontoGruppe kontoGruppe);

	public void close();
}
