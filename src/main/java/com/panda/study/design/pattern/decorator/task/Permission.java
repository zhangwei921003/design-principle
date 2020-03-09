package com.panda.study.design.pattern.decorator.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {

  VISITOR("游客"),
  NORMAL_USER("普通用户"),
  VIP_USER("VIP用户"),
  ADMIN("管理员");
  private final String value;

}
