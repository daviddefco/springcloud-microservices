package com.daviddefco.codelabs.microservices.eureka.dao;

import org.springframework.stereotype.Component;

@Component
public class ArticleDaoImpl extends WordDaoImpl {
    @Override
    public String getServiceName() {
        return ARTICLE_SERVICE_NAME;
    }
}
