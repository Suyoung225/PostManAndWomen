package com.example.postmanandwomen.repository;

import com.example.postmanandwomen.domain.Post;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> findAllByOrderByModifiedAtDesc();
}
