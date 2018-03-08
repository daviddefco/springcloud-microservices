package com.daviddefco.codelabs.microservices.eureka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired WordService wordService;

    @Override
    public String buildSentence() {
        return String.format("%s %s %s %s %s",
            wordService.getSubject(),
            wordService.getVerb(),
            wordService.getArticle(),
            wordService.getAdjective(),
            wordService.getNoun()
        );
    }
}
