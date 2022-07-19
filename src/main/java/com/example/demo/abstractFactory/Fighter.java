package com.example.demo.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter extends Character{
	protected List<String> attributes = new ArrayList<String>();
	
	public Fighter() {
		this.createFighter();
	}
		
	public List<String> getAttributes() {
		return attributes;
	}

	public abstract void createFighter();
}
