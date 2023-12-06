package com.app.poja.endpoint.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
@RequestMapping("/new-prime")
public class EvenController {
    @GetMapping("/")
    public BigInteger generateNewPrime() {
        BigInteger prime = generatePrime();
        return prime;
    }

    private BigInteger generatePrime() {
        int bitLength = 1000;
        return BigInteger.probablePrime(bitLength, new SecureRandom());
    }
}
