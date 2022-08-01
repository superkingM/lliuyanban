package com.wang.controller;


import com.wang.pojo.Article;
import com.wang.pojo.Comment;
import com.wang.service.ArticleService;
import com.wang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/")
    public String index(Model model) {
        List<Article> articles = articleService.queryAllArticles();
        model.addAttribute("articles", articles);
        List<Comment> comments = commentService.commentListLimit5();
        model.addAttribute("comments", comments);
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("article", new Article());
        return "add";
    }

    @PostMapping("/add")
    public void addArticel(Article article, HttpServletResponse response) throws IOException {
        Date date = new Date();
        article.setCreated(date);
        boolean b = articleService.saveArticle(article);
        response.sendRedirect("/");
    }
}
