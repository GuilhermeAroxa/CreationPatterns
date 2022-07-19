package com.example.demo.abstractFactory;

public abstract class CharacterFactory {

	public static CharacterFactory getCharacterFactory(Boolean fight) {
		if (fight) {
			return new FighterFactory();
		} else {
			return new SoccerPlayerFactory();
		}	
	}
	
	public abstract Character getCharacter(CharacterType type);
}
