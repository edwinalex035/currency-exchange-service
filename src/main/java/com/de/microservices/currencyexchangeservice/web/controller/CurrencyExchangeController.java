package com.de.microservices.currencyexchangeservice.web.controller;

import com.de.microservices.currencyexchangeservice.domain.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue() {
        return new ExchangeValue(100L, "USD", "INR", new BigDecimal(65), Integer.parseInt(environment.getProperty("local.server.port")));
    }

}
