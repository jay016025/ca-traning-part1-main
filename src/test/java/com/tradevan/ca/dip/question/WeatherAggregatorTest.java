package com.tradevan.ca.dip.question;

import com.tradevan.ca.solid.dip.question.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class WeatherAggregatorTest {

    WeatherAggregator weatherAggregator;
    AccuweatherApi accu;
    BbcWeatherApi bbc;
    CbcWeatherApi cbc;

    @BeforeEach
    public void setUp() {
        accu = new AccuweatherApi();
        bbc = new BbcWeatherApi();
        cbc = new CbcWeatherApi();
        weatherAggregator = new WeatherAggregator();

    }

    @Test
    public void testThrowNoMachApiException() {

        // Assert
        Assertions.assertThrows(RuntimeException.class,
                () -> weatherAggregator.getTemperature(), "no match api");
    }

    @Test
    public void testGetTemperature() {

        // arrange
        accu.setTemperature(20d);
        bbc.setTemperature(32d);
        weatherAggregator.addTemperature(accu);
        weatherAggregator.addTemperature(bbc);

        // act
        BigDecimal temperature = weatherAggregator.getTemperature();

        // assert
        Assertions.assertEquals(new BigDecimal(10), temperature);

    }

    @Test
    public void testAddCbcWeatherApi() {

        // arrange
        accu.setTemperature(20d);
        bbc.setTemperature(32d);
        cbc.setTemperature(40d);
        weatherAggregator.addTemperature(accu);
        weatherAggregator.addTemperature(bbc);
        weatherAggregator.addTemperature(cbc);

        // act
        BigDecimal temperature = weatherAggregator.getTemperature();

        // assert
        Assertions.assertEquals(new BigDecimal(20), temperature);
    }
}
