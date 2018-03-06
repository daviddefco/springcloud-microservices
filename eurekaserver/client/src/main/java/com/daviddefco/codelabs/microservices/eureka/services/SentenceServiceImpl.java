package com.daviddefco.codelabs.microservices.eureka.services;

import com.daviddefco.codelabs.microservices.eureka.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private AdjectiveClient adjectiveClient;

    @Autowired
    private ArticleClient articleClient;

    @Autowired
    private NounClient nounClient;

    @Autowired
    private SubjectClient subjectClient;

    @Autowired
    private VerbClient verbClient;

    @Override
    public String buildSentence() {
        return String.format("%s %s %s %s %s",
            subjectClient.getWord(),
            verbClient.getWord(),
            articleClient.getWord(),
            adjectiveClient.getWord(),
            nounClient.getWord()
        );
    }
}
