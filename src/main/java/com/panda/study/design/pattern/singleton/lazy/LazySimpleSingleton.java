package com.panda.study.design.pattern.singleton.lazy;

/**
 * 懒汉式单例：在外部调用时才实例化对象，即延迟加载； 优点：节省内存 缺点：线程不安全
 */
public class LazySimpleSingleton {

  private static LazySimpleSingleton INSTANCE = null;

  public LazySimpleSingleton() {
  }

  public static LazySimpleSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LazySimpleSingleton();
    }
    return INSTANCE;
  }
}
