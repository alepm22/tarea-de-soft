package com.example.frankyservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationParam {

    @Value("${dollarOfficial}") // Importa una variable desde application.yaml
    private double officialDollar;

    public double getOfficialDollar() {
        return officialDollar;
    }
}
