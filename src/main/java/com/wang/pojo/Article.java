package com.wang.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Article {
    private Long id;
    private String name;
    private String title;
    private String content;
    private Date created;
    private List<Comment> commentList;
}
