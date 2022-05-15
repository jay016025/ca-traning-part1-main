package com.tradevan.ca.solid.dip.question;

import com.tradevan.ca.solid.dip.question.util.ConvertCelcius;

public class BbcWeatherApi implements IWeatherApi {

	private double temperature;

	public void setTemperature(double v) {
		this.temperature = v;
	}

	@Override
	public double getTemperatureCelecius() {
		return ConvertCelcius.toCelcius(this.temperature);
	}
}
