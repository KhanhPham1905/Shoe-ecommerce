package com.nhom10.application.service;

import com.nhom10.application.entity.Comment;
import com.nhom10.application.model.request.CreateCommentPostRequest;
import com.nhom10.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
