package com.panda.study.design.pattern.singleton;

import com.panda.study.design.pattern.singleton.lazy.LazySynchronizedSingleton;

public class ExecutorThread implements Runnable {

  public void run() {
    LazySynchronizedSingleton instance = LazySynchronizedSingleton.getInstance();
    System.out.println("当前线程: " + Thread.currentThread().getName() + ",对象地址：" + instance);
  }

  public static void main(String[] args) {
    System.out.println("线程执行开始");
    Thread t1 = new Thread(new ExecutorThread());
    Thread t2 = new Thread(new ExecutorThread());

    t1.start();
    t2.start();

    System.out.println("线程执行🔚");
  }
}
