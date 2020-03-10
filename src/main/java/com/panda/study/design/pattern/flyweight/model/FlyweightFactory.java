package com.panda.study.design.pattern.flyweight.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

  private final static FlyweightFactory INSTANCE = new FlyweightFactory();
  private static Map<String, IFlyweight> cache = new ConcurrentHashMap<>();

  public static FlyweightFactory getInstance() {
    return INSTANCE;
  }

  public IFlyweight get(String key) {
    if (!cache.containsKey(key)) {
      System.out.println("初始化创建IFlyweight对象: " + key);
      IFlyweight flyweight = new ConcreteFlyweight();
      cache.put(key, flyweight);
      return flyweight;
    }
    System.out.println("从Cache中获取IFlyweight对象： " + key);
    return cache.get(key);
  }
}
