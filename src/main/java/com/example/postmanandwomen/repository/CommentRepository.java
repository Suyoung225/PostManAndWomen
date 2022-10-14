package com.example.postmanandwomen.repository;

import com.example.postmanandwomen.domain.Comment;
import com.example.postmanandwomen.domain.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findAllByPost(Post post);
}
