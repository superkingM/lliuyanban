package com.wang.mapper;

import com.wang.pojo.Article;

import java.util.List;

public interface ArticelMapper {
    List<Article> queryAllArticles();

    boolean saveArticle(Article article);
}
