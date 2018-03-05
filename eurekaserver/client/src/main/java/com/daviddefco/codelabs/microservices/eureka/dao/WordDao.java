package com.daviddefco.codelabs.microservices.eureka.dao;

import com.daviddefco.codelabs.microservices.eureka.domain.Word;

public interface WordDao {
    static final String ARTICLE_SERVICE_NAME = "article-client";
    static final String ADJECTIVE_SERVICE_NAME = "adjective-client";
    static final String NOUN_SERVICE_NAME = "noun-client";
    static final String SUBJECT_SERVICE_NAME = "subject-client";
    static final String VERB_SERVICE_NAME = "verb-client";

    Word getWord();
}
