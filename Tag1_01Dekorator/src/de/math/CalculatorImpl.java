package de.math;
import static java.lang.Thread.sleep;
public class CalculatorImpl implements Calculator {
	
	@Override
	public double add(double a, double b) {
		
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a + b;
	}
	@Override
	public double sub(double a, double b) {
		return a - b;
	}

}
