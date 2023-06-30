package com.prototype;

public class Particleman extends GameUnit {

	private String state = "idle";

	public void orbit() {
		this.state = "orbiting";
	}

	@Override
	public String toString() {
		return "Particleman " + state + " @ " + getPosition();
	}

	@Override
	protected void reset() {
		state = "idle";
	}

	
}
