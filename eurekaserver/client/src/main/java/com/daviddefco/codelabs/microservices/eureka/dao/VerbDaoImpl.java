package com.daviddefco.codelabs.microservices.eureka.dao;

import org.springframework.stereotype.Component;

@Component
public class VerbDaoImpl extends WordDaoImpl {
    @Override
    public String getServiceName() {
        return VERB_SERVICE_NAME;
    }
}
