package com.example.frankyservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    //ConverterService converterService;

    //ConverterController (ConverterService converterService)
    //{
    //    this.converterService=converterService;
    //}

    @Autowired
    ConverterService converterService;

    @GetMapping("/status")
    public String getStatus()
    {
        return "OK";
    }
    @PostMapping("/converter/celcuis-to-fahrenheit")
    public ResponseEntity<ConverterResponseDto> celciusToFahrenheit(@RequestBody ConverterRequestDto converterRequestDto){
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.celciusToFahrenheit(
                  converterRequestDto.value()
                ),
                "F"
        );

        return ResponseEntity.ok(response);
    }
}
