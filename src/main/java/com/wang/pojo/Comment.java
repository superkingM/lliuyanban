package com.wang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private Long id;
    private Long UserId;
    private Long articleId;
    private String content;
    private Date created;
}
