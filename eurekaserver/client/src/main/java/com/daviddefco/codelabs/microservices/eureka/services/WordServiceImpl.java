package com.daviddefco.codelabs.microservices.eureka.services;

import com.daviddefco.codelabs.microservices.eureka.dao.*;
import com.daviddefco.codelabs.microservices.eureka.domain.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {
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
    @HystrixCommand(fallbackMethod = "defaultSubject")
    public Word getSubject() {
        return subjectClient.getWord();
    }

    public Word defaultSubject() {
        return new Word("Someone");
    }

    @Override
    public Word getVerb() {
        return verbClient.getWord();
    }

    @Override
    public Word getArticle() {
        return articleClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "defaultAdjective")
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    public Word defaultAdjective() {
        return new Word("");
    }

    @Override
    public Word getNoun() {
        return nounClient.getWord();
    }
}
