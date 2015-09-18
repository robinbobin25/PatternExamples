package patterns.Factory.parsers;

import patterns.Factory.AbstractComputerBuilder;

import java.util.ArrayList;

public class SAX_Parser extends AbstractComputerBuilder {

	@Override
	public ArrayList<?> parser() {
		System.out.println("DOM_Parser realization");
		return null;
	}

}
