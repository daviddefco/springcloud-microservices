package com.daviddefco.codelabs.microservices.eureka.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Word {
    private String word;

    @Override
    public String toString() {
        return word;
    }
}
