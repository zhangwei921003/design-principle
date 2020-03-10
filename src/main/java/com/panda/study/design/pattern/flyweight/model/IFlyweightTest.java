package com.panda.study.design.pattern.flyweight.model;

public class IFlyweightTest {

  public static void main(String[] args) {
    FlyweightFactory factory = FlyweightFactory.getInstance();
    IFlyweight flyweight = factory.get("first");
    IFlyweight flyweight1 = factory.get("first");
    System.out.println(flyweight.equals(flyweight1));
  }
}
