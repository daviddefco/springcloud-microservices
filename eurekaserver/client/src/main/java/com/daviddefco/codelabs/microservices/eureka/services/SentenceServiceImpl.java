package com.daviddefco.codelabs.microservices.eureka.services;

import com.daviddefco.codelabs.microservices.eureka.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private AdjectiveClient adjectiveDaoImpl;

    @Autowired
    private ArticleClient articleDaoImpl;

    @Autowired
    private NounClient nounDaoImpl;

    @Autowired
    private SubjectClient subjectDaoImpl;

    @Autowired
    private VerbClient verbDaoImpl;

    @Override
    public String buildSentence() {
        return String.format("%s %s %s %s %s",
            subjectDaoImpl.getWord().getWord(),
            verbDaoImpl.getWord().getWord(),
            articleDaoImpl.getWord().getWord(),
            adjectiveDaoImpl.getWord().getWord(),
            nounDaoImpl.getWord().getWord()
        );
    }
}
