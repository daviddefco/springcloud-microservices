package com.daviddefco.codelabs.microservices.configserver.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutationController {

    @Value("${salutation}")
    String salutationFormula;

    @GetMapping("/hello/{name}")
    public String salute(@PathVariable String name) {
        return String.format("%s %s", salutationFormula, name);
    }
}
