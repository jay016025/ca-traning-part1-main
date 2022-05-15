package com.tradevan.ca.solid.dip.question;

public class AccuweatherApi implements IWeatherApi {

	private double temperature;

	public void setTemperature(double v) {this.temperature = v;}

	@Override
	public double getTemperatureCelecius() {
		return this.temperature;
	}
}
