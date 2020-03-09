package com.panda.study.design.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 类加载机制:先加载外部类，后加载内部类 ClassPath : LazyInnerStaticSingleton.class LazyInnerStaticSingleton$LazyHolder.class 静态内部类单例模式
 * 优点：利用了Java本身语法特点，性能高，避免了内存浪费，不会被反射破坏 缺点：不够优雅
 */
public class LazyInnerStaticSingleton {

  public LazyInnerStaticSingleton() {

    if (LazyHolder.INSTANCE != null) {
      throw new RuntimeException("Can not create duplicated instance!");
    }
  }

  /*
   * 每一个关键字都不是多余的，static 是为了使单例的空间共享，保证这个方法不会被重写、重载;
   */
  public static final LazyInnerStaticSingleton getInstance() {
    return LazyHolder.INSTANCE;
  }

  private static class LazyHolder {

    private static final LazyInnerStaticSingleton INSTANCE = new LazyInnerStaticSingleton();

  }


  public static void main(String[] args) {
    try {

      Class<?> clazz = LazyInnerStaticSingleton.class;
      Constructor<?> constructor = clazz.getDeclaredConstructor(null);
      constructor.setAccessible(true);
      ////暴力初始化
      Object o = constructor.newInstance();
      System.out.println(o);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
