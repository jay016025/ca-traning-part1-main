package com.tradevan.ca.solid.dip.question;


import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

// question: 如何新增一個 CBC 氣像預測功能, 在不異動此程式的情況下完成?

public class WeatherAggregator {
    private List<IWeatherApi> apis = new ArrayList<>();

    public BigDecimal getTemperature() {

        if(this.apis.isEmpty()) {
            throw new RuntimeException("no match api");
        }

        double sum = apis.stream()
                .map(IWeatherApi::getTemperatureCelecius)
                .reduce((t1, t2) -> t1 + t2)
                .orElse(0d);

        BigDecimal res = new BigDecimal(sum).divide(new BigDecimal(apis.size()), 0, RoundingMode.HALF_UP);

       return res;

//        return (accuweather.getTemperatureCelcius()
//        		+ toCelcius(
//        				bbcWeather.getTemperatureFahrenheit())) / 2;
    }

    public void addTemperature(IWeatherApi api) {
        this.apis.add(api);
    }
}
