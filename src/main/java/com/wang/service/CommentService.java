package com.wang.service;

import com.wang.mapper.CommentMapper;
import com.wang.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> findByAid(int id) {
        return commentMapper.findByAid(id);
    }

    public List<Comment> commentListLimit5() {
        return commentMapper.commentListLimit5();
    }
}
