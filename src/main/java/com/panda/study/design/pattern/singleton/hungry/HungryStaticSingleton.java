package com.panda.study.design.pattern.singleton.hungry;

/**
 * 饿汉静态块单例模式
 */
public class HungryStaticSingleton {

  private static final HungryStaticSingleton INSTANCE;

  static {
    INSTANCE = new HungryStaticSingleton();
  }

  private HungryStaticSingleton() {
  }

  public static HungryStaticSingleton getInstance() {
    return INSTANCE;
  }
}
