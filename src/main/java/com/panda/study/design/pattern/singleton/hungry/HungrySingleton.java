package com.panda.study.design.pattern.singleton.hungry;

/**
 * 类加载顺序：先上后下，先静态后动态，先属性后方法
 * <p>
 * 优点：没有锁机制，执行效率比较高 缺点：类加载的时候就初始化，不管用不用都占空间，浪费内存
 * <p>
 * 典型示例：
 *
 * @see org.springframework.context.ApplicationContext 后续来验证
 */
public class HungrySingleton {

  private static final HungrySingleton INSTANCE = new HungrySingleton();

  private HungrySingleton() {
  }

  public static HungrySingleton getInstance() {
    return INSTANCE;
  }
}
