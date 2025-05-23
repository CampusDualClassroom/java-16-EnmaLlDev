package com.campusdual.classroom;

public class Plane implements IMachine{

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}

	public String getName() {
		return name;
	}

	@Override
	public void start() {
		System.out.println(getName() + " arranca");
	}

	@Override
	public void stop() {
		System.out.println(getName() +" detiene");
	}

	@Override
	public void maintenance() {
		System.out.println(getName() + " mantenimiento");
	}
}
