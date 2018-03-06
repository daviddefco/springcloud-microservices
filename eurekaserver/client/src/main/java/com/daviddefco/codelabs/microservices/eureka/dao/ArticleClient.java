package com.daviddefco.codelabs.microservices.eureka.dao;

import com.daviddefco.codelabs.microservices.eureka.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("article-client")
public interface ArticleClient {
    @GetMapping("/") Word getWord();
}
