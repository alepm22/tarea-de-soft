package com.example.frankyservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    ConfigurationParam configurationParam;

    public ConverterService(ConfigurationParam configurationParam) {
        this.configurationParam = configurationParam;
    }


    public double celciusToFahrenheit(double celcius)
    {
        return (celcius*9/5)+32;
    }

    public double fahrenheitToCelcius(double fahrenheit)
    {
        return (fahrenheit-32)*5/9;
    }

    public double bolivianToDollar(double bolivian)
    {
        return bolivian/ configurationParam.getOfficialDollar();
    }
}

