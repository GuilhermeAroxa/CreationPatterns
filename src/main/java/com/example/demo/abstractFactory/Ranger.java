package com.example.demo.abstractFactory;

public class Ranger extends Fighter {

	@Override
	public void createFighter() {
		attributes.add("Arco");
		attributes.add("Flecha");
	}

}
