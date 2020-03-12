package com.panda.study.design.pattern.template.jdbc.entity;

import lombok.Data;

@Data
public class Member {

  private String userName;
  private String password;
  private String nickName;
  private Integer age;
  private String addr;
}
