package com.de.microservices.currencyexchangeservice.repository;

import com.de.microservices.currencyexchangeservice.domain.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    public ExchangeValue findByFromAndTo(String from, String to);
}
