package com.daviddefco.codelabs.microservices.eureka.dao;

import com.daviddefco.codelabs.microservices.eureka.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

public abstract class WordDaoImpl implements WordDao{
    @Autowired
    LoadBalancerClient loadBalancer;

    public abstract String getServiceName();

    @Override
    public Word getWord() {
        ServiceInstance chosenService = loadBalancer.choose(getServiceName());
        // RestTemplate has to be new for each request, that's why it is not injected
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(chosenService.getUri(), Word.class);
    }
}
