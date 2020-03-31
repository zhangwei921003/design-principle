package com.panda.study.design.pattern.chain.auth;

import lombok.Data;

@Data
public class Member {

  private String loginName;
  private String password;
  private String roleName;

  public Member(String loginName, String password) {
    this.loginName = loginName;
    this.password = password;
  }
}
