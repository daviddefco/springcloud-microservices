package com.daviddefco.codelabs.microservices.configserver.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "salutation")
public class SalutationController {

    String formula;
    String tailQuestion;

    @GetMapping("/hello/{name}")
    public String salute(@PathVariable String name) {
        return String.format("%s %s, %s", formula, name, tailQuestion);
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getTailQuestion() {
        return tailQuestion;
    }

    public void setTailQuestion(String tailQuestion) {
        this.tailQuestion = tailQuestion;
    }
}
