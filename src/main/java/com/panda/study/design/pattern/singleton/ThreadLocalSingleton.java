package com.panda.study.design.pattern.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ThreadLocalSingleton {

  private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
      new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
          return new ThreadLocalSingleton();
        }
      };

  public static ThreadLocalSingleton getInstance() {
    return threadLocalInstance.get();
  }
}
