package com.daviddefco.codelabs.microservices.eureka.dao;

import org.springframework.stereotype.Component;

@Component
public class NounDaoImpl extends WordDaoImpl {
    @Override
    public String getServiceName() {
        return NOUN_SERVICE_NAME;
    }
}
