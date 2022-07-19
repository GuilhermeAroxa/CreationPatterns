package com.example.demo.abstractFactory;

public class Tank extends Fighter {

	@Override
	public void createFighter() {
		attributes.add("Armadura");
		attributes.add("Machado");
	}

}
