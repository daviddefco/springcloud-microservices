package com.daviddefco.codelabs.microservices.eureka.services;

import com.daviddefco.codelabs.microservices.eureka.dao.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private WordDao adjectiveDaoImpl;

    @Autowired
    private WordDao articleDaoImpl;

    @Autowired
    private WordDao nounDaoImpl;

    @Autowired
    private WordDao subjectDaoImpl;

    @Autowired
    private WordDao verbDaoImpl;

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
