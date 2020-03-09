package com.panda.study.design.pattern.singleton.lazy;

/**
 * Double-Check单例模式 优点:线程安全，性能显著提高 缺点:代码的可读性差，显得不够优雅。
 * “Double-Check”体现在进行了两次 if (instance == null)
 * 	  的检查,这样既同步代码块保证了线程安全,同时实例化的代码也只会执行一次,实例化后同步操作不会再被执行,从而效率提升很多
 * 	  双重检查锁定（DCL）方式也是延迟加载的,它唯一的问题是,由于Java
 * 	  编译器允许处理器乱序执行,在JDK版本小于1.5时会有DCL失效的问题。当然
 * 	  ,现在大家使用的JDK普遍都已超过1.4,只要在定义单例时加上1.5及以上版本具体化了的volatile关键字
 * 	  ,即可保证执行的顺序,从而使单例起效。所以 DCL 方式是推荐的一种方式。<br>
 *
 * 	  双重检查锁定（DCL）单例在 JDK 1.5 之前版本失效原因解释：
 * 	   在高并发环境,JDK 1.4
 * 	  及更早版本下,双重检查锁定偶尔会失败。其根本原因是,Java 中 new 一个对象并不是一个原子操作,编译时
 * 	  singleton = new Singleton();
 * 	  语句会被转成多条汇编指令,它们大致做了3件事情：
 * 	  1) 给 Singleton 类的实例分配内存空间;
 * 	  2) 调用私有的构造函数 Singleton(),初始化成员变量;
 * 	  3) 将 singleton 对象指向分配的内存（执行完此操作 singleton就不是 null 了）
 * 	  由于Java编译器允许处理器乱序执行,
 * 	  以及 JDK1.5之前的旧的Java内存模型（Java Memory Model）中
 * 	  Cache、寄存器到主内存回写顺序的规定,上面步骤 2) 和 3) 的执行顺序是无法确定的,可能是 1)→2)→3) 也可能是 1) →3)→2)
 * 	  。如果是后一种情况,在线程 A 执行完步骤 3) 但还没完成 2) 之前,被切换到线程 B 上,此时线程 B 对 singleton
 * 	  第1次判空结果为 false,直接取走了 singleton使用,但是构造函数却还没有完成所有的初始化工作,就会出错,也就是 DCL 失效问题。
 * 	  在 JDK 1.5的版本中具体化了 volatile 关键字,将其加在对象前就可以保证每次都是从主内存中读取对象,从而修复了 DCL
 * 	  失效问题。当然,volatile 或多或少还是会影响到一些性能,但比起得到错误的结果,牺牲这点性能还是值得的。
 */
public class LazyDoubleCheckSingleton {

  private static LazyDoubleCheckSingleton INSTANCE;

  public LazyDoubleCheckSingleton() {
  }

  public static LazyDoubleCheckSingleton getInstance() {
    //检查是否阻塞
    if (null == INSTANCE) {
      synchronized (LazyDoubleCheckSingleton.class) {
        //检查是否重复创建
        if (null == INSTANCE) {
          INSTANCE = new LazyDoubleCheckSingleton();
        }
      }
    }
    return INSTANCE;
  }
}
