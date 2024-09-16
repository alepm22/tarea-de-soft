package com.example.frankyservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConverterServiceTest {
    @Mock
    ConfigurationParam configurationParam;

    @InjectMocks
    ConverterService converterService;

    @Test
    @DisplayName("Method to Convert celcius to fahrenheit") //Nombre del test
    void celciusToFahrenheit() {
        assertEquals(212,converterService.celciusToFahrenheit(100));
    }

    @Test
    @DisplayName("Method to Convert fahrenheit to celcius") //Nombre del test
    void fahrenheitToCelcius() {
        assertEquals(100,converterService.fahrenheitToCelcius(212));

    }

    @Test
    @DisplayName("bolivian to dolalr") //Nombre del test
    void bolivianToDollar() {
        when(configurationParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(100,converterService.bolivianToDollar(696));
    }

}

