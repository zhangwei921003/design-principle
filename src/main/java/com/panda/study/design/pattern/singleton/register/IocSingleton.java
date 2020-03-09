package com.panda.study.design.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IocSingleton {

  private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

  public static Object getInstance(String className) {
    synchronized (ioc) {
      if (!ioc.containsKey(className)) {
        try {
          Object instance = Class.forName(className).newInstance();
          ioc.put(className, instance);
          return instance;
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    return ioc.get(className);
  }
}
