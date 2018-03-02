package com.daviddefco.codelabs.microservices.eureka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

    @Autowired
    RestTemplate template;

    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
        return
            getWord("subject-client") + " "
            + getWord("verb-client") + " "
            + getWord("article-client") + " "
            + getWord("adjective-client") + " "
            + getWord("noun-client") + "."
        ;
    }

    public String getWord(String service) {
        return template.getForObject("http://" + service, String.class);
    }
}