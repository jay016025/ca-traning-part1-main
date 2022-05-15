package com.tradevan.ca.solid.dip.question;

public class CbcWeatherApi implements IWeatherApi {

	public double getTemperatureFahrenheit() {
		return 0;
	}

	private double temperature;

	public void setTemperature(double temperature) {this.temperature = temperature;}

	@Override
	public double getTemperatureCelecius() {
		return this.temperature;
	}
}
