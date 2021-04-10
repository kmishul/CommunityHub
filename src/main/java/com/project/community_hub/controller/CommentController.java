package com.project.community_hub.controller;

import com.project.community_hub.model.Comment;
import com.project.community_hub.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {
    @Autowired
    CommentRepository commentRepository;

    @PostMapping("/addcomment")
    public String addComment(Comment comment)  {
        commentRepository.save(comment);

        return "";
    }
}
