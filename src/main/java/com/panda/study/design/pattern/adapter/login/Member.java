package com.panda.study.design.pattern.adapter.login;

import java.util.UUID;
import lombok.Data;

@Data
public class Member {

  private String username;
  private String password;
  private String mid;

  public Member(String username, String password) {
    this.username = username;
    this.password = password;
    this.mid = UUID.randomUUID().toString();
  }
}
