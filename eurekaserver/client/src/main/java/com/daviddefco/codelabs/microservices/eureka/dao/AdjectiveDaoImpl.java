package com.daviddefco.codelabs.microservices.eureka.dao;

import org.springframework.stereotype.Component;

@Component
public class AdjectiveDaoImpl extends WordDaoImpl {
    @Override
    public String getServiceName() {
        return ADJECTIVE_SERVICE_NAME;
    }
}
