package com.byke.step.service;

import com.byke.step.model.Articles;
import com.byke.step.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;


    @Override
    public Articles saveArticles(Articles articleRequest) {
        return articleRepository.save(articleRequest);
    }
}
