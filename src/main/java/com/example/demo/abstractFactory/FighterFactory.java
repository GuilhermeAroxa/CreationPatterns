package com.example.demo.abstractFactory;

public class FighterFactory extends CharacterFactory{

	@Override
	public Character getCharacter(CharacterType type) {
		switch(type) {
			case TANK:
				return new Tank();
			case RANGER:
				return new Ranger();
			case MAGICIAN:
				return new Magician();
			default:
				return null;
		}
	}
}
