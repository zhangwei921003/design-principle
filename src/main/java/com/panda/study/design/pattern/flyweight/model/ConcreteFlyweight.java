package com.panda.study.design.pattern.flyweight.model;

public class ConcreteFlyweight implements IFlyweight {

  @Override
  public void create(String msg) {
    System.out.println("ConcreteFlyweight Instance:" + msg);
  }
}
