package com.panda.study.design.pattern.singleton.register;

import lombok.Getter;

@Getter
public enum EnumsSingleton {
  INSTANCE;

  public static EnumsSingleton getInstance() {
    return INSTANCE;
  }
}
