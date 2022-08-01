package com.wang.service;

import com.wang.mapper.ArticelMapper;
import com.wang.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticelMapper articelMapper;

    public List<Article> queryAllArticles() {
        return articelMapper.queryAllArticles();
    }

    public boolean saveArticle(Article article) {
        return articelMapper.saveArticle(article);
    }

}
