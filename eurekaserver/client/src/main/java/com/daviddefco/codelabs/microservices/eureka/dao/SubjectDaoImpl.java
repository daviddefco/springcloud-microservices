package com.daviddefco.codelabs.microservices.eureka.dao;

import org.springframework.stereotype.Component;

@Component
public class SubjectDaoImpl extends WordDaoImpl {
    @Override
    public String getServiceName() {
        return SUBJECT_SERVICE_NAME;
    }
}
