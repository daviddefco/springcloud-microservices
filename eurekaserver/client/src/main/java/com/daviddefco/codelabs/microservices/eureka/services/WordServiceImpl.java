package com.daviddefco.codelabs.microservices.eureka.services;

import com.daviddefco.codelabs.microservices.eureka.dao.*;
import com.daviddefco.codelabs.microservices.eureka.domain.Word;
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
    public Word getSubject() {
        return subjectClient.getWord();
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
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    @Override
    public Word getNoun() {
        return nounClient.getWord();
    }
}
