package com.wang.mapper;

import com.wang.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    List<Comment> findByAid(int id);

    List<Comment> commentListLimit5();
}
