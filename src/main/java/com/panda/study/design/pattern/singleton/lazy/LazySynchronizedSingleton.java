package com.panda.study.design.pattern.singleton.lazy;

/**
 * 懒汉式单例：在外部调用方法上加入synchronized锁关键字。 优点：节省内存，线程安全 缺点：方法加锁导致性能低
 */
public class LazySynchronizedSingleton {

  private static LazySynchronizedSingleton INSTANCE = null;

  public LazySynchronizedSingleton() {
  }

  public synchronized static LazySynchronizedSingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LazySynchronizedSingleton();
    }
    return INSTANCE;
  }
}
