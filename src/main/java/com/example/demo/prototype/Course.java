package com.example.demo.prototype;


//3.2 Prototype - Deep Clone
//Cria objetos com muitos parâmetros, quase sempre precisa da interface Cloneable ou Clone
//Deep Copy - Copia apenas os valores
public abstract class Course implements Cloneable{
	private String name;
	private double price;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
