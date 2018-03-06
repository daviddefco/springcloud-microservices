package com.daviddefco.codelabs.microservices.eureka.services;

import com.daviddefco.codelabs.microservices.eureka.domain.Word;

public interface WordService {
    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();
}
