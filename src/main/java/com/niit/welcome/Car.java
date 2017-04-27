package com.niit.welcome;

public class Car {
	private String color;
	private Engine engine;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("CALLING SETTER METHOD TO SET THE VALUE OF COLOR" + color);
		this.color = color;
	}
public String run(){
	return engine.start();
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

}
