package com.revaturelabs.ap2.post;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
@RequestMapping("/post")
public class PostController {

  private PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping
  public List<Post> findAllPosts() {
    return this.postService.findAll();
  }

  @GetMapping("/{id}")
  public CompletableFuture<Post> getPostById(@PathVariable int id) {
    CompletableFuture<Post> t1 = this.postService.getPostById(id);
    CompletableFuture<Post> t2 = this.postService.getPostById(id + 1);
    CompletableFuture<Post> t3 = this.postService.getPostById(id + 2);

    CompletableFuture.allOf(t1, t2, t3);
    return t1;
  }
}
