package com.revaturelabs.ap2.post;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Post {
  int id;
  int userId;
  String title;
  String body;
}
