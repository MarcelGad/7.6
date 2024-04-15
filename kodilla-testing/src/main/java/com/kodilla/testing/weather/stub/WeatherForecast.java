package com.kodilla.testing.weather.stub;

import com.kodilla.testing.weather.stub.Temperatures;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        List<Double> tempValues = new ArrayList<>(temperatures.getTemperatures().values());
        double sum = 0;
        for (double temp : tempValues) {
            sum += temp;
        }
        return sum / tempValues.size();
    }

    public double calculateMedianTemperature() {
        List<Double> tempValues = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(tempValues);
        int size = tempValues.size();
        if (size % 2 == 0) {
            return (tempValues.get(size / 2 - 1) + tempValues.get(size / 2)) / 2.0;
        } else {
            return tempValues.get(size / 2);
        }
    }
}