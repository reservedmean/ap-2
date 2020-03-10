package com.revaturelabs.ap2.batch;

import javax.persistence.*;

@Entity
public class Batch {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;

  @Column
  String name;
}
