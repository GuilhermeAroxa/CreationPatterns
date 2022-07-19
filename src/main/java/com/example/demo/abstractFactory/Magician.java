package com.example.demo.abstractFactory;

public class Magician extends Fighter {

	@Override
	public void createFighter() {
		attributes.add("Cajado");
		attributes.add("Cartola");
		attributes.add("Cabelos longos");
	}

}
