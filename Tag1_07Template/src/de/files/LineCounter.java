package de.files;

public class LineCounter extends AbstractCounter{

	
	
	@Override
	public void process(char c) {
		if(c == '\n')
			counter ++;

	}
	
	

}
