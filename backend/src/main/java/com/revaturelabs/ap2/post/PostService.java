package com.revaturelabs.ap2.post;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
public class PostService {

  private PostClient postClient;

  public PostService(PostClient postClient) {
    this.postClient = postClient;
  }

  List<Post> findAll() {
    return this.postClient.getPosts();
  }

  @Async
  CompletableFuture<Post> getPostById(int postId) {
    log.info("Enter Service with id = {}", postId);
    return CompletableFuture.completedFuture(this.postClient.getPostById(postId));
  }
}
