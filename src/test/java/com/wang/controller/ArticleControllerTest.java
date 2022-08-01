package com.wang.controller;

import com.wang.pojo.Article;
import com.wang.pojo.User;
import com.wang.service.ArticleService;
import com.wang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleControllerTest {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        List<Article> articles = articleService.queryAllArticles();
        System.out.println(articles);
    }

    @Test
    public void test2() {
        User user = userService.queryTest();
        System.out.println(user);
    }
}